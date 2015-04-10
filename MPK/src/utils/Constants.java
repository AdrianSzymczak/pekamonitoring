/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Adrian TODO: This class should be loaded from config file Changing
 * this values when program is running won't be necessary
 */
public class Constants {

    public static String URLTemplate = "http://www.peka.poznan.pl/vm/method.vm?ts=1426074314843";
    public static String replacementTemplate = "WIOS41";
    public static String payloadTemplate = "method=getTimes&p0=%7B%22symbol%22%3A%22WIOS41%22%7D";
    /* this value was empirically estimated - the less the better but we might encounter errors from the server 
     (just check it by yourself but setting it to 0
     results are visible only after about 500 requests and we need to be able to query endlessly) */
    public static int politnessMilisecondsSleep = 0;

    public static int defaultBuildInStopsArrayFromInclusive = 0;
    public static int defaultBuildInStopsArrayToInclusive = 300;
    // there are 1408 elements in stops hardcoded memory loader
    public static int buildInStopsArrayFromInclusive = defaultBuildInStopsArrayFromInclusive;
    public static int buildInStopsArrayToInclusive = defaultBuildInStopsArrayToInclusive;
}
