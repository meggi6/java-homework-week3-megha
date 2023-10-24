package javaweek3hw;

import java.util.stream.IntStream;

/**
 *  Write a Java program to test if an array contains a specific value
 */
public class Programme_20_Array {

    public static void main(String[] args) {
        //declare array
        int num[] = {11, 20, 35, 45};

        //value to check
        int find = 54;

        //IntStream function to check specific value
        boolean found = IntStream.of(num).anyMatch(n -> n == find);

        if (found)
            System.out.println(find +" is found");
        else
            System.out.println(find +" is not found");
    }
}
