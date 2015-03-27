/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.requests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Stop;
import utils.Constants;
import utils.TimeMeasurement;

/**
 *
 * @author Adrian
 */
public class WebDataObtainer implements IDataObtainer {

    private URL url;
    private String urlString;
    private OutputStream os = null;
    private PrintWriter pw = null;
    private URLConnection connection;
    private StringBuffer sb;
    private String payload;
    private InputStream is = null;
    private BufferedReader reader;
    private String response;
    private TimeMeasurement ts;

    public WebDataObtainer() {
        urlString = Constants.URLTemplate;
    }

    public WebDataObtainer(String urlString) {
        this.urlString = urlString;
    }

    @Override
    public Collection<String> ObtainData(Collection<Stop> stops) {
        Collection<String> result = new LinkedList();
        try {
            url = new URL(urlString);
        } catch (MalformedURLException ex) {
            Logger.getLogger(WebDataObtainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        ts = new TimeMeasurement(2);
        ts.AddMeasurement();

        // comment curr and max behaviour for testing full list of stops
        int curr = 0;
        int max = 5;
        for (Stop stop : stops) {
            if (curr++ > max) {
             break;
             }
             
            try {
                try {
                    Thread.sleep(Constants.politnessMilisecondsSleep);
                } catch (InterruptedException ex) {
                    Logger.getLogger(WebDataObtainer.class.getName()).log(Level.SEVERE, null, ex);
                }

                payload = Constants.payloadTemplate.replace(Constants.replacementTemplate, stop.getSymbol());
                sb = new StringBuffer();

                connection = url.openConnection();
                connection.setDoInput(true);
                connection.setDoOutput(true);
                connection.connect();

                os = connection.getOutputStream();
                pw = new PrintWriter(new OutputStreamWriter(os));
                pw.write(payload);
                pw.close();
                os.close();

                is = connection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(is));

                String line = null;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }

                is.close();
                response = sb.toString();
                result.add(response);
            } catch (IOException ex) {
                Logger.getLogger(WebDataObtainer.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (pw != null) {
                    pw.close();
                }
                if (os != null) {
                    try {
                        os.close();
                    } catch (IOException ex) {
                        Logger.getLogger(WebDataObtainer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (is != null) {
                    try {
                        is.close();
                    } catch (IOException ex) {
                        Logger.getLogger(WebDataObtainer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }

        ts.AddMeasurement();
        System.out.println("(comment it for more clear result) Local measurement time[in ms]: " + ts.GetTotalDifference());
        
        return result;
    }
}
