package javaweek3hw;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
 * find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */
public class Programme_10 {

    public static void operations(){
        Scanner obj = new Scanner(System.in); // scanner declaration
        System.out.println("Enter first number :");
        int num1 = obj.nextInt();
        System.out.println("Enter second number :");
        int num2 = obj.nextInt();
        System.out.println("Enter symbol like +, -, /, * :");
        char operator = obj.next().charAt(0); // store symbols in char datatype
        obj.close();

        // declare result
        int result;
        if (operator == '+'){
           result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '/') {
            result = num1 / num2;
        } else {
            result = num1 * num2;
        }
        System.out.println("The result is: "+result);
    }

    public static void main(String[] args) {

        Programme_10.operations();// calling static method using class
    }
}
