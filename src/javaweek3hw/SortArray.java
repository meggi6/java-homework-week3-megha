package javaweek3hw;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array
 */
public class SortArray {

    public static void num(){
        int [] numericArray = {6, 3, 45, 78,3};
        String stringArray [] = {"name", "megha", "QA", "IT company"};

        Arrays.sort(numericArray);  // Sorting the numeric array
        String x = Arrays.toString(numericArray);
        System.out.println("Sorted numeric array : "+x);

        Arrays.sort(stringArray); // Sorting the string array
        String y = Arrays.toString(stringArray);
        System.out.println("Sorted numeric array : "+y);
    }

    public static void main(String[] args) {
        num();
    }
}
