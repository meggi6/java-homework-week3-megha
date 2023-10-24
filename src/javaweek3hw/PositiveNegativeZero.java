package javaweek3hw;

import java.util.Scanner;

/**
 *  Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO
 */
public class PositiveNegativeZero {

    public static void num(int a){
        if (a>0){
            System.out.println(a+" is Positive number");
        } else if (a<0) {
            System.out.println(a+" is Negative number");
        } else {
            System.out.println(a+" is Zero number");
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); // scanner declaration
        System.out.println("Enter any integer number :");
        int a = obj.nextInt();
        num(a);
        obj.close();
    }
}
