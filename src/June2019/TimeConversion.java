/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package June2019;

import Utilities.TimeMeasurementUtility;

/**
    Given a time in -hour AM/PM format, convert it to military (24-hour) time.

    Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

    Function Description

    Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

    timeConversion has the following parameter(s):

    s: a string representing time in  hour format
    Input Format

    A single string  containing a time in -hour clock format (i.e.:  or ), where  and .

    Constraints

    All input times are valid
    Output Format

    Convert and print the given time in -hour format, where .

    Sample Input 0

    07:05:45PM
    Sample Output 0

    19:05:45
 */
public class TimeConversion {
    
    public static String TimeConversion(String s) {
                
        // Initialize empty 24-hour final string to be printed
        String finalTime = "";
        
        // Initialize variable representing Hours    
        String hours = s.substring(0, (s.indexOf(":")));
        
        // Initialize empty variable to hold the 'AM or PM'
        String amOrPm = s.substring(s.length() - 2, s.length());     
        
        // If AM, just print or current current string without AM / PM
        if (amOrPm.equals("AM")) {            
            
            finalTime = s;

            // What if it's 12AM?, then set hours to 0
            if (hours.equals("12"))
                finalTime = "00" + finalTime.substring(2, finalTime.length());
    
            return finalTime.substring(0, finalTime.length() - 2);
        }
        
        if (hours.equals("12"))
            return s.substring(0, s.length()-2);

        // Add 12 hours to current hours value
        hours = "" + (Integer.valueOf(hours) + 12);
        
        finalTime = hours + s.substring(2, s.length()-2);
        
        return finalTime;
    }
    
}
