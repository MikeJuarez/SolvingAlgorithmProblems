/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package June2019;

import Utilities.TimeMeasurementUtility;

/**
    You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she can successfully blow out.

    For example, if your niece is turning  years old, and the cake will have  candles of height , , , , she will be able to blow out  candles successfully, since the tallest candles are of height  and there are  such candles.

    Function Description

    Complete the function birthdayCakeCandles in the editor below. It must return an integer representing the number of candles she can blow out.

    birthdayCakeCandles has the following parameter(s):

    ar: an array of integers representing candle heights
    Input Format

    The first line contains a single integer, , denoting the number of candles on the cake. 
    The second line contains  space-separated integers, where each integer  describes the height of candle .

    Constraints

    Output Format

    Print the number of candles that can be blown out on a new line.

    Sample Input 0

    4
    3 2 1 3
    Sample Output 0

    2
    Explanation 0

    We have one candle of height , one candle of height , and two candles of height . Your niece only blows out the tallest candles, meaning the candles where . Because there are  such candles, we print  on a new line.
 */
public class BirthdayCakeCandles {

    public static void BirthDayCakeCandles(int[] ar) {
        
        // Declare variables
        int currentHighestCandle = 0;
        int candleCount = 0;
        int currentCandle = 0;

        // Loop through each candle in array        
        for (int i = 0; i < ar.length; i++) {

            // Set currentCandle to the position of i in candles array
            currentCandle = ar[i];

            // Keep track of highest candle.  If currentCandle > currentHighestCandle
            // Then set currentCandle = currentHighestCandle and reset candleCount
            if (currentCandle > currentHighestCandle) {
                currentHighestCandle = currentCandle;
                candleCount = 1;
                continue;
            }

            // If currentCandle == currentHighestCandle, then incremnt count
            if (currentCandle == currentHighestCandle) {
                candleCount++;
            }
        }

        // Loop is done. Print out the total amount of candles
        System.out.println("Candle count: " + ((Integer) candleCount).toString());
        System.out.println("Highest candle: " + ((Integer) currentHighestCandle).toString());        
    }

}
