package javaweek3hw;

import java.util.Scanner;

/**
 *  Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6 {

    // instance method
    public void oddEven(){
        Scanner sc = new Scanner(System.in);  // scanner declaration
        System.out.println("Enter a integer number: ");
        int num = sc.nextInt();  // input provided by user stored in num
        sc.close();

        // If number is divisible by 2 then it's an even number
        // else it is an odd number
        if (num % 2 == 0){
            System.out.println(num +" is even number");
        } else {
            System.out.println(num +" is odd number");
        }
    }
}
