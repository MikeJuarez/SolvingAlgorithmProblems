/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package May2019;

import Utilities.TimeMeasurementUtility;

/**
 *
 *
 * https://www.hackerrank.com/challenges/staircase/problem Consider a staircase
 * of size :
 *
 * #
 * ## ### ####
 *
 * Observe that its base and height are both equal to , and the image is drawn
 * using # symbols and spaces. The last line is not preceded by any spaces.
 * Write a program that prints a staircase of size . Function Description
 * Complete the staircase function in the editor below. It should print a
 * staircase as described above. staircase has the following parameter(s):
 *
 * n: an integer Input Format
 *
 * A single integer, , denoting the size of the staircase.
 *
 * Constraints  *
 * Output Format
 *
 * Print a staircase of size using # symbols and spaces. Note: The last line
 * must have spaces in it. Sample Input
 *
 * 6
 * Sample Output
 *
 * #
 * ## ### #### ##### ###### Explanation
 *
 * The staircase is right-aligned, composed of # symbols and spaces, and has a
 * height and width of .
 */
public class ModelStairCase0528 {
    
    // Non-optimized stairCase algorithm
    public static String staircase(int n) {
        
        // Initialize the final stair case
        String stairCase = "";

        // Need 3 loops, one that loops through entire size (decrement)
        // Loop will continue until index is >= 1
        for (int i = 1; i <= n; i++) {
            
            // Will help set the amount of spaces to be set
            int spaceCount = n - i;

            // (2nd loop) Keep track of the spaces
            for (int s = 0; s < spaceCount; s++) {
                stairCase = stairCase + " ";
            }
            
            // (3rd loop) Keep track of the #'s (index)
            for (int ns = 0; ns < i; ns++) {
                stairCase = stairCase + "#";
            }
            
            stairCase = stairCase + "\n";   
        }

        return stairCase;
    }    
    
    // Optimized stairCase algorithm
    public static String staircaseOptimize1(int n) {
                
        // Initialize the final stair case
        String stairCase = "";

        // Loop will continue until index is >= 1
        for (int i = 1; i <= n; i++) {            
            // Will help set the amount of spaces to be set
            int spaceCount = n - i;            
            stairCase = stairCase + new String(new char[spaceCount]).replace("\0", " ");
            stairCase = stairCase + new String(new char[i]).replace("\0", "#");
            stairCase = stairCase + "\n";   
        }

        return stairCase;
    }

}
 