package javaweek3hw;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol
 */
public class NumberOrAlphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a input: ");
        String input = sc.nextLine();
        char character = input.charAt(0);
        identifyInput(character);
    }

    public static char identifyInput(char character) {

        if (Character.isDigit(character)) {        //Character.isDigit to verify the number
            System.out.println("The input is number.");
        } else if (Character.isLetter(character)) {    //Character.isLetter to verify the alphabet
            System.out.println("The input is an alphabet.");
        } else {
            System.out.println("The input is a symbol.");
        }
        return character;
    }
}
