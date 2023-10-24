package javaweek3hw;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
 * (marks is between 0 to 100 and if it is out of range print error message “Invalid Input,
 * Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

public class ResultOfStudent {

    public static void m1(int math, int science, int english, int rollNum, String name) {

        // condition for checking valid marks.
        if ((math <= 0 || math >= 100) || (science <= 0 || science >= 100) || (english <= 0 || english >= 100)) {
            System.out.println("Invalid inputs, enter valid range ");
        }

        int totalMarks = math + english + science;
        double percentage = (100 * totalMarks) / 300;

        // Check if the student has passed or failed by ternary operator
        String result = (percentage >= 35) ? "Pass" : "Fail";

        String grade = "";
        if (percentage >= 80 && percentage <= 100) {
            grade = "A+";
        } else if (percentage >= 60 && percentage <= 80) {
            grade = "A";
        } else if (percentage >= 50 && percentage <= 60) {
            grade = "B";
        } else if (percentage >= 35 && percentage <= 50) {
            grade = "C";
        } else if (percentage < 35) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks");
        }

        // Display mark sheet
        System.out.println(" ____________________________");
        System.out.println("|                            |");
        System.out.println("|        MARK SHEET          |");
        System.out.println("|____________________________|");
        System.out.println("|  Name       :  " + name + "       |");
        System.out.println("|  Roll no    :  " + rollNum + "    |");
        System.out.println("|____________________________|");
        System.out.println("|  Subjects   :  Marks          |");
        System.out.println("|____________________________|");
        System.out.println("|  Math       :  " + math + "       |");
        System.out.println("|  Science    :  " + science + "    |");
        System.out.println("|  English    :  " + english + "    |");
        System.out.println("|_______________________________|");
        System.out.println("|  Total      :  " + totalMarks + " |");
        System.out.println("|____________________________|");
        System.out.println("|  Percentage :  " + percentage + " |");
        System.out.println("|  Result     :  " + result + "     |");
        System.out.println("|  Grade      :  " + grade + "      |");
        System.out.println("|___________________________|");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name");
        String name = sc.nextLine();
        System.out.println("Enter student's roll number");
        int rollNum = sc.nextInt();
        System.out.println("Enter student's marks in Maths");
        int math = sc.nextInt();
        System.out.println("Enter student's marks in English");
        int english = sc.nextInt();
        System.out.println("Enter student's marks in Science");
        int science = sc.nextInt();
        m1(math, english, science, rollNum, name);
        sc.close();
    }
}
