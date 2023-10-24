package javaweek3hw;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme1_OddOrEven {

    // instance method
    public void ternaryOperator(){
        Scanner sc = new Scanner(System.in);  // scanner declaration
        System.out.println("Enter a integer number: ");
        int num = sc.nextInt();  // input provided by user stored in num
        sc.close();

        // ternary operator
        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println("The input is "+result);
    }

    public static void main(String[] args) {
        Programme1_OddOrEven t = new Programme1_OddOrEven(); // object creation
        t.ternaryOperator();  // calling instance method using object
    }
}
