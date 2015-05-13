/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Viz
 */
public class file {
    public static Random r = new Random();
    public static int filesuffix = r.nextInt();
    
    public static void save_into_file(String s) throws IOException{
        String filename = get_date_filename()+"-"+filesuffix+".txt";
        //System.out.println("Current Date: " + filename);
        FileWriter file = new FileWriter(filename,true); //append mode
        file.write(s);
        file.write(System.lineSeparator());
        file.close();
    }
    private static String get_date_filename() {
        String d;
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd");
        d = ft.format(dNow);
        return d;
    }
    private static void createFileIfNotExists(String s) throws IOException{
        File file = new File(s);
        file.createNewFile();
    }
}
