/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package June2019;

import Utilities.TimeMeasurementUtility;

/**
 * Given five positive integers, find the minimum and maximum values that can be
 * calculated by summing exactly four of the five integers. Then print the
 * respective minimum and maximum values as a single line of two space-separated
 * long integers.
 *
 * For example, . Our minimum sum is and our maximum sum is . We would print
 *
 * 16 24 Function Description
 *
 * Complete the miniMaxSum function in the editor below. It should print two
 * space-separated integers on one line: the minimum sum and the maximum sum of
 * of elements.
 *
 * miniMaxSum has the following parameter(s):
 *
 * arr: an array of integers Input Format
 *
 * A single line of five space-separated integers.
 *
 * Constraints
 *
 *
 * Output Format
 *
 * Print two space-separated long integers denoting the respective minimum and
 * maximum values that can be calculated by summing exactly four of the five
 * integers. (The output can be greater than a 32 bit integer.)
 *
 * Sample Input
 *
 * 1 2 3 4 5
 * Sample Output
 *
 * 10 14 Explanation
 *
 * Our initial numbers are , , , , and . We can calculate the following sums
 * using four of the five integers:
 *
 * If we sum everything except , our sum is . If we sum everything except , our
 * sum is . If we sum everything except , our sum is . If we sum everything
 * except , our sum is . If we sum everything except , our sum is . Hints:
 * Beware of integer overflow! Use 64-bit Integer.
 */
public class MiniMaxSum {
    
    public static void MiniMaxSum(int[] inputValues) {        
        
        int min = inputValues[0];
        int max = inputValues[0];
        long total = 0;
        
        for (int val : inputValues) {
            
            if (min < val)
                min = val;
            
            if (max > val)
                max = val;
            
            total += val;
        }        
      
        System.out.println("inputValues size: " + inputValues.length);
        System.out.print("" + (total-min));
        System.out.println(" " + (total-max));
        
    }

}
