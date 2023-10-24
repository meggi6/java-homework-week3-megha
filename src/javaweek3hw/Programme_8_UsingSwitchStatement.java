package javaweek3hw;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly
 * (use switch) if any other alphabet should be invalid entry
 */
public class Programme_8_UsingSwitchStatement {
    // instance method
    public void city() {
        Scanner obj = new Scanner(System.in); // scanner declaration
        System.out.println("Enter any alphabet from A to F :");
        char a = obj.next().charAt(0);
        a = Character.toUpperCase(a); // Convert input to uppercase for case-insensitivity

        // Determine the city name
        String cityName;
        switch (a) {
            case 'A':
                cityName = "Ahemdabad";
                break;
            case 'B':
                cityName = "Baroda";
                break;
            case 'C':
                cityName = "Chandigarh";
                break;
            case 'D':
                cityName = "Delhi";
                break;
            case 'E':
                cityName = "England";
                break;
            case 'F':
                cityName = "Faridabad";
                break;
            default:
                cityName = "Invalid inputs";
        }
        System.out.println("City name is : "+ cityName);
    }

    public static void main(String[] args) {
        Programme_8_UsingSwitchStatement n= new Programme_8_UsingSwitchStatement();// object creating
        n.city(); // calling instance method using object
    }
}
