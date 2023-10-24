package javaweek3hw;

import java.util.Arrays;

/**
 * Write a Java program to sum values of an array
 */
public class SumOfArray {
    public static void main(String[] args) {
        int num [] = {7, 20, 6, 67, 10};

        //sum using stream function
        int sum = Arrays.stream(num).sum();
        System.out.println("The sum of the number is: "+ sum);
    }
}
