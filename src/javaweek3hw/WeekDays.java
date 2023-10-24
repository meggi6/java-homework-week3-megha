package javaweek3hw;

import java.util.Scanner;

/**
 *  Write a Java program which input any number between 1 to 7 and
 *  it prints The Days name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 *  NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class WeekDays {

    public static void m1(int day){

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); // scanner declaration
        System.out.println("Enter input range from 1 to 7 :");
        int day = obj.nextInt();
        m1(day);
        obj.close();
    }
}
