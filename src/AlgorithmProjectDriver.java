/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Utilities.TimeMeasurementUtility;
import May2019.ModelStairCase0528;

/**
 *
 * @author Michael J
 */
public class AlgorithmProjectDriver {
    
    public static void main(String[] args) {        
        
        AlgorithmProjectDriver algorithmProject = new AlgorithmProjectDriver();
        
        // Staircase algorithm 5/28/2019
        algorithmProject.callStairCase();
    }    
    
    // Staircase algorithm 5/28/2019
    // https://www.hackerrank.com/challenges/staircase/problem
    private void callStairCase() {                
        // Start time for non-optimized solution
        long startTime1 = System.nanoTime(); // 
        // Get the stairCase string from the non-optimized solution
        String stairCase1 = ModelStairCase0528.staircase(500);        
        // Mark the end time for non-optimized solution
        long endTime1 = System.nanoTime();                           
        
        // Start time for optimized solution
        double startTime2 = System.nanoTime();
        // Get the stairCase string from the optimized solution
        String stairCase2 = ModelStairCase0528.staircaseOptimize1(500);
        // Mark the end time for optimized solution
        long endTime2 = System.nanoTime();  
        
        // Get the total duration in nanoseconds for non-optimized solution
        double duration1 = TimeMeasurementUtility.measureTime(startTime1, endTime1);
        // Get the total duration in nanoseconds for optimized solution
        double duration2 = TimeMeasurementUtility.measureTime(startTime2, endTime2);
        // Calculate percentage
        double percentageFaster = TimeMeasurementUtility.calculateOptimizationTime(duration1, duration2);
        
        // Print the staircases
        System.out.println(stairCase1);  
        System.out.println(stairCase2);
        
        // Print the durations
        System.out.println("Duration 1: " + duration1);
        System.out.println("Duration 2: " + duration2);
        System.out.println("The optimized algorithm is faster by " + percentageFaster + "%");   
    }
    
}
