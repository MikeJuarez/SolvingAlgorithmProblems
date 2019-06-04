/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.text.DecimalFormat;

/**
 *
 * @author user
 */
public class TimeMeasurementUtility {
    
    private static final double NANO_TO_SECONDS_MULTIPLIER = 1e-9;
    
    public static void measureAndPrintTime(double startTime, double endTime) {           
        String finalTime = new DecimalFormat("####.######").format((endTime - startTime) * NANO_TO_SECONDS_MULTIPLIER);
        System.out.println("Seconds Elapsed: " + finalTime);
    }
    
    public static double calculateOptimizationTime(double time1, double time2) {
       return (Math.abs(time2 - time1) / Math.min(time1, time2)) * 100;
    }
    
}
