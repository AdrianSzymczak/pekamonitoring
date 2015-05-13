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
import java.util.ArrayList;
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
    private static int totalCounter = 0;

    public WebDataObtainer() {
        urlString = Constants.URLTemplate;
    }

    public WebDataObtainer(String urlString) {
        this.urlString = urlString;
    }
    
    @Override
    public Collection<String> ObtainData(Collection<Stop> stopsCollection) {
        int counter;           
        int repetitions = 3;
        int sleepEveryN = 282;        
        Collection<String> result = new LinkedList();        
        ArrayList<Stop> stops = (ArrayList<Stop>) stopsCollection;
        ArrayList<Stop> newStops = new ArrayList<Stop>(stops.size());
        for(Stop s : stops) {
            newStops.add(new Stop(s));
        }
        try {
            url = new URL(urlString);
        } catch (MalformedURLException ex) {
            Logger.getLogger(WebDataObtainer.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        for(int i = 0; i <repetitions; i++){
            counter = stops.size()-1;            
        while(stops != null && stops.size() != 0 && counter >= 0){                        
            //System.out.println("totalCounter: " + totalCounter + " counter: " + counter + " i: " + i + " stop: " + stops.get(counter).getSymbol() + " nssize " + newStops.size() + " stopsize " + stops.size());            
            totalCounter++;
            if(totalCounter % sleepEveryN == 0){
            try {
                    Thread.sleep(Constants.politnessMilisecondsSleep);
                } catch (InterruptedException ex) {
                    Logger.getLogger(WebDataObtainer.class.getName()).log(Level.SEVERE, null, ex);
                }    
            }               
            payload = Constants.payloadTemplate.replace(Constants.replacementTemplate, stops.get(counter).getSymbol());
            sb = new StringBuffer();
                
            try {
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
                if(!response.startsWith("{\"success\""))
                    response += (" " + stops.get(counter).getSymbol());
                result.add(response); 
                //System.out.println("removing from new: " + counter + " removing " + newStops.get(counter).getSymbol());
                newStops.remove(counter);                
            } catch (IOException ex) {                
                Logger.getLogger(WebDataObtainer.class.getName()).log(Level.SEVERE, null, ex);                
            } finally {
                counter--;                            
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
        stops = newStops;
        if(stops != null && stops.size() != 0){
        newStops = new ArrayList<Stop>(stops.size());
        for(Stop s : stops) {
            newStops.add(new Stop(s));
        }        
        }        
        }
        return result;
    }
}
