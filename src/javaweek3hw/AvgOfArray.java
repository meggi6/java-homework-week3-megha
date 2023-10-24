package javaweek3hw;

import java.util.Arrays;

/**
 *  Write a Java program to calculate the average value of array elements
 */
public class AvgOfArray {
    public static void main(String[] args) {
        int[] num = {7, 20, 6, 67, 10};

        // average using stream function
        double average = Arrays.stream(num).average().orElse(0);
        System.out.println("The average of the numbers is: "+ average);
    }
}
