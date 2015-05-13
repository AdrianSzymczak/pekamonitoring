/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpk;

import com.sun.corba.se.impl.orbutil.closure.Constant;
import data.IStopsDataLoader;
import data.StopsFileLoader;
import data.StopsHardcodedMemoryLoader;
import java.io.Console;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import model.Stop;
import utils.Constants;
import web.requests.IDataObtainer;
import web.requests.WebDataObtainer;
import database.file;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.crypto.Data;
import org.json.simple.parser.ParseException;
import org.apache.logging.log4j.*;

/**
 *
 * @author Adrian Szymczak
 */
public class MPK {

     static Logger log = LogManager.getLogger(MPK.class.getName());
       
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, SQLException, ParseException {

        for (int i = 0; i < args.length; i += 2) {
            if (args[i].equalsIgnoreCase("-politness")) {
                Constants.politnessMilisecondsSleep = Integer.valueOf(args[i + 1]);
            }
        }

        IStopsDataLoader stopsLoader = new StopsHardcodedMemoryLoader();
        Collection<Stop> stops = stopsLoader.LoadData();
        IDataObtainer dataObtainer = new WebDataObtainer();
        Collection<String> results;
        // TODO: we should add classes and logic to save JSONs collection somewhere
     //   db d = new db();
        while (true) {              
            results = dataObtainer.ObtainData(stops);
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            System.out.println("time: " + dateFormat.format(date) + " size " + results.size()); //2014/08/06 15:59:48
            
            // we should consider creating single string from results instead of for each line and creating file writer 1407 times 
            for (String res : results) {                
                log.error(";" + res);
                //file.save_into_file(res);                
                //System.out.println(res);
                //d.saveIntoDataBase(res);                
            }
        }
    }
}
