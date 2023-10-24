package javaweek3hw;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly
 * (use if else) if any other alphabet should be invalid entry
 */
public class Programme_8 {

    // instance method
    public void city(){
        Scanner obj = new Scanner(System.in); // scanner declaration
        System.out.println("Enter any alphabet from A to F :");
        char a = obj.next().charAt(0);
        a= Character.toUpperCase(a); // Convert input to uppercase for case-insensitivity

        // Determine the city name
        String cityName;
        if (a == 'A') {
            cityName = "Ahemdabad";
        } else if (a == 'B') {
            cityName = "Baroda";
        } else if (a == 'C') {
            cityName = "Chandigarh";
        } else if (a == 'D') {
            cityName = "Delhi";
        } else if (a == 'E') {
            cityName = "England";
        } else if (a == 'F') {
            cityName = "Faridabad";
        } else {
            cityName = "Invalid inputs";
        }
        System.out.println("City name is : "+ cityName);
    }

    public static void main(String[] args) {
        Programme_8 t = new Programme_8(); // object creating
        t.city(); // calling instance method using object
    }
}
