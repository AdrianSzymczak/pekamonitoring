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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Stop;
import utils.Constants;
import web.requests.IDataObtainer;
import web.requests.WebDataObtainer;
import database.db;
import java.sql.SQLException;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Adrian Szymczak
 */
public class MPK {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, SQLException, ParseException {

        for (int i = 0; i < args.length; i += 2) {
            if (args[i].equalsIgnoreCase("-from")) {
                Constants.buildInStopsArrayFromInclusive = Integer.valueOf(args[i + 1]);
            }
            if (args[i].equalsIgnoreCase("-to")) {
                Constants.buildInStopsArrayToInclusive = Integer.valueOf(args[i + 1]);
            }
            if (args[i].equalsIgnoreCase("-politness")) {
                Constants.politnessMilisecondsSleep = Integer.valueOf(args[i + 1]);
            }
        }

        IStopsDataLoader stopsLoader = new StopsHardcodedMemoryLoader();
        Collection<Stop> stops = stopsLoader.LoadData();
        IDataObtainer dataObtainer = new WebDataObtainer();
        Collection<String> results;

        // TODO: we should add classes and logic to save JSONs collection somewhere
        db d = new db();
        while (true) {
            results = dataObtainer.ObtainData(stops);
            for (String res : results) {
                System.out.println(res);
                d.saveIntoDataBase(res);
            }
        }
    }
}
