/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package June2019;

/**
 *
 * @author user
 */
public class BirthdayCakeCandles {

    public static void BirthDayCakeCandles(int[] candles) {

        // Declare variables
        int currentHighestCandle = 0;
        int candleCount = 0;
        int currentCandle = 0;

        // Loop through each candle in array        
        for (int i = 0; i < candles.length; i++) {

            // Set currentCandle to the position of i in candles array
            currentCandle = candles[i];

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
