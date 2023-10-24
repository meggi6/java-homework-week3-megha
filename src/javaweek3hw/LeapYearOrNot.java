package javaweek3hw;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */
public class LeapYearOrNot {

    // static method
    public static void year(){
        Scanner sc = new Scanner(System.in); // scanner declaration
        System.out.println("Enter any year: ");
        int yr = sc.nextInt(); // entered input store in yr
        sc.close();

        boolean x = (yr % 4 == 0) && (yr % 100 != 0); // if yr is not completely divisible by 100 and completely divisible by 4, then it is leap year
        boolean y = yr % 400 == 0; // if yr is century year and completely divisible by 400, it is leap yaer

        if (x || y) {
            System.out.println(yr +" is leap year");
        } else {
            System.out.println(yr +" is not leap year");
        }
    }


    public static void main(String[] args) {
        LeapYearOrNot.year(); // calling static method using class
    }
}
