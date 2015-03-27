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

/**
 *
 * @author Adrian Szymczak
 */
public class MPK {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        IStopsDataLoader stopsLoader = new StopsHardcodedMemoryLoader();
        Collection<Stop> stops = stopsLoader.LoadData();
        IDataObtainer dataObtainer = new WebDataObtainer();
        Collection<String> results;

        // TODO: we should add classes and logic to save JSONs collection somewhere
        while (true) {   
            results = dataObtainer.ObtainData(stops);
            for (String res : results) {
                System.out.println(res);
            }
        }
    }
}
