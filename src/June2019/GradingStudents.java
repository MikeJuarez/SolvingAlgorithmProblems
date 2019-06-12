/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package June2019;

/**
 * https://www.hackerrank.com/challenges/grading/problem
 * HackerLand University has the following grading policy:

   Every student receives a  in the inclusive range from  to .
   Any  less than  is a failing grade.
   Sam is a professor at the university and likes to round each student's  according to these rules:

   If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
   If the value of  is less than , no rounding occurs as the result will still be a failing grade.
   For example,  will be rounded to  but  will not be rounded because the rounding would result in a number that is less than .

   Given the initial value of  for each of Sam's  students, write code to automate the rounding process.

   Function Description

   Complete the function gradingStudents in the editor below. It should return an integer array consisting of rounded grades.

   gradingStudents has the following parameter(s):

   grades: an array of integers representing grades before rounding
   Input Format

   The first line contains a single integer, , the number of students. 
   Each line  of the  subsequent lines contains a single integer, , denoting student 's grade.

   Constraints

   Output Format

   For each , print the rounded grade on a new line.
 */
public class GradingStudents {

    public static int[] gradingStudents(int[] grades) {

        int[] newGrades = new int[grades.length];

        // Loop through the array
        for (int i = 0; i < grades.length; i++) {

            int currentGrade = grades[i];

            // Check if grade is less than 40, if so, print grade
            if (currentGrade < 38 || currentGrade % 5 == 0) {
                newGrades[i] = currentGrade;
                continue;
            }

            // Create a temp variable that divides value by 5, then add 1, the multiply              //   by 5
            int nextGrade = ((currentGrade / 5) + 1) * 5;

            // Create variable to hold value: Subtract temp variable minus current grade
            if ((nextGrade - currentGrade) <= 2) {
                newGrades[i] = nextGrade;
            } else {
                newGrades[i] = currentGrade;
            }
        }
        
        return newGrades;
    }
}
