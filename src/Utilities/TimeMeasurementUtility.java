/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

/**
 *
 * @author user
 */
public class TimeMeasurementUtility {
    
    public static double measureTime(double startTime, double endTime) {           
        return endTime - startTime;
    }
    
    public static double calculateOptimizationTime(double time1, double time2) {
       return (Math.abs(time2 - time1) / Math.min(time1, time2)) * 100;
    }
    
}
