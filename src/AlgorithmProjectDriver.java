/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import June2019.BirthdayCakeCandles;
import static June2019.BirthdayCakeCandles.BirthDayCakeCandles;
import June2019.GradingStudents;
import June2019.MiniMaxSum;
import June2019.TimeConversion;
import Utilities.TimeMeasurementUtility;
import May2019.ModelStairCase0528;
import Utilities.ArrayPrinter;
import java.text.DecimalFormat;

/**
 *
 * @author Michael J
 */
public class AlgorithmProjectDriver {
    
    public static void main(String[] args) {        
        
        AlgorithmProjectDriver algorithmProject = new AlgorithmProjectDriver();
        
        // Staircase algorithm 5/28/2019
        algorithmProject.callStairCase();
        
        // MiniMaxSum algorithm 6/3/2019        
        algorithmProject.callMiniMaxSum();      
        
        // BirthdayCakeCandles 6/8/2019 (Appropriate because it's my birthday!)
        algorithmProject.callBirthdayCakeCandles();
        
        // Time Conversion 6/10/2019
        algorithmProject.callTimeConversion();
        
        // Grading Students 6/12/2019
        algorithmProject.callGradingStudents();
    }    
    
    
    // Staircase algorithm 5/28/2019
    // https://www.hackerrank.com/challenges/staircase/problem
    private void callStairCase() {    
        TimeMeasurementUtility.printChallengeHeader("ModelStairCase");
        
        // Start time for non-optimized solution
        long startTime1 = System.nanoTime(); // 
        // Get the stairCase string from the non-optimized solution
        String stairCase1 = ModelStairCase0528.staircase(5);        
        // Mark the end time for non-optimized solution
        long endTime1 = System.nanoTime();                           
        
        // Start time for optimized solution
        double startTime2 = System.nanoTime();
        // Get the stairCase string from the optimized solution
        String stairCase2 = ModelStairCase0528.staircaseOptimize1(5);
        // Mark the end time for optimized solution
        long endTime2 = System.nanoTime();  
        
        // Get the total duration in nanoseconds for non-optimized solution
        double duration1 = TimeMeasurementUtility.getTimeDifference(startTime1, endTime1);
        // Get the total duration in nanoseconds for optimized solution
        double duration2 = TimeMeasurementUtility.getTimeDifference(startTime2, endTime2);
        
        // Calculate percentage
        double percentageFaster = TimeMeasurementUtility.calculateOptimizationTime(duration1, duration2);
                        
        // Print the staircases
        System.out.println(stairCase1);  
        System.out.println(stairCase2);
        
        // Print the durations]
        
        System.out.println("Duration 1: " + duration1);
        System.out.println("Duration 2: " + duration2);
        System.out.println("The optimized algorithm is faster by " + percentageFaster + "%");   
    }
    
    // MiniMaxSum algorithm 6/3/2019
    // https://www.hackerrank.com/challenges/mini-max-sum/problem
    private void callMiniMaxSum() {
        
        TimeMeasurementUtility.printChallengeHeader("MiniMaxSum");
        
        // Generate a random length for our input array (between 1 and 5)
        double randomNumber = Math.random() * ((5 - 1) + 1) + 1;
        
        // Create an empty array of size randomNumber
        int[] inputValues = new int[(int)randomNumber];
        
        // Loop through empty array and add a random number to each spot in the array
        for (int i = 0; i < (int)randomNumber; i++) {
            inputValues[i] = (int) (Math.random()*((10-1)+1))+1;            
        }
                
        double startTime = System.nanoTime();   // Mark the start time         
        MiniMaxSum.MiniMaxSum(inputValues);     // Send the array through for processing
        double endTime = System.nanoTime();     // Mark the end time
        
        // Print elapsed time
        TimeMeasurementUtility.measureAndPrintTime(startTime, endTime);        
    }
    
    // BirthdayCakeCandles Chellenge 6/8/2019
    // https://www.hackerrank.com/challenges/birthday-cake-candles/problem
    private void callBirthdayCakeCandles() {
        TimeMeasurementUtility.printChallengeHeader("BirthDayCakeCandles");
        
        int[] candles = {1, 34, 25, 72, 25, 8, 6, 4, 72, 2, 71, 0, -1, 36, 72, 25, 25, 25, 1, 34, 25, 72, 25, 8, 6, 4, 72, 2, 71, 0, -1, 36, 72, 25, 25, 25, 1, 34, 25, 72, 25, 8, 6, 4, 72, 2, 71, 0, -1, 36, 72, 25, 25, 25, 1, 34, 25, 72, 25, 8, 6, 4, 72, 2, 71, 0, -1, 36, 72, 25, 25, 25, 1, 34, 25, 72, 25, 8, 6, 4, 72, 2, 71, 0, -1, 36, 72, 25, 25, 25};
               
        double startTime = System.nanoTime();
        BirthdayCakeCandles.BirthDayCakeCandles(candles);
        double endTime = System.nanoTime();
        
        // Print elapsed time
        TimeMeasurementUtility.measureAndPrintTime(startTime, endTime);        
    }
    
    // Time Conversion Challenge 6/10/19
    // https://www.hackerrank.com/challenges/time-conversion/problem
    private void callTimeConversion() {
        
        TimeMeasurementUtility.printChallengeHeader("TimeConversion");        
        
        String time = "11:59:59PM";
        
        double startTime = System.nanoTime();
        System.out.println(TimeConversion.TimeConversion(time));
        double endTime = System.nanoTime();
        
        // Print elapsed time
        TimeMeasurementUtility.measureAndPrintTime(startTime, endTime);        
    }
    
    // Grading Students Challenge 6/12/19
    // https://www.hackerrank.com/challenges/grading/problem
    private void callGradingStudents() {
        
        TimeMeasurementUtility.printChallengeHeader("Calling GradingStudents()");        
        
        int[] grades = {73, 67, 38, 33};
        
        // Print the array
        System.out.println("Input Unformatted Grades Input:");
        ArrayPrinter.printArray(ArrayPrinter.ArrayType.INTEGER, grades);
        
        double startTime = System.nanoTime();
        int[] newGrades = GradingStudents.gradingStudents(grades);
        double endTime = System.nanoTime();
        
        // Print the array
        System.out.println("Grades after reformat:");
        ArrayPrinter.printArray(ArrayPrinter.ArrayType.INTEGER, newGrades);
        
        // Print elapsed time
        TimeMeasurementUtility.measureAndPrintTime(startTime, endTime); 
    }
    
    
}
