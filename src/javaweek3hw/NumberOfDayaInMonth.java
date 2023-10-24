package javaweek3hw;

import java.util.Scanner;

public class NumberOfDayaInMonth {

    //Leap year method
    public static boolean isLeapYear(int year) {

        // Check if the year is valid
        if (year < 1 || year > 9999) {
            System.out.println("False, Enter valid year");
            return false;
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is leap year");
            return true;
        } else {
            System.out.println(year + " is not leap year");
            return false;
        }
    }

    //no. of days in month
    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) && (year < 1 || year > 9999)) {
            System.out.println("Enter month between 1 to 12");
            return -1;
        }

        int da;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                da = 31;
                System.out.println("The month " + month + " has " + da + " days");
            case 2:
                if (isLeapYear(year)) {
                    da = 29;
                    System.out.println("Since it is leap year "+year+" The month " + month + " has " + da + " days");
                } else {
                    da = 28;
                    System.out.println("Since it is leap year "+year+" The month " + month + " has " + da + " days");
                }
            case 4:
            case 6:
            case 9:
            case 11:
                da = 30;
                System.out.println("The month " + month + " has " + da + " days");
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter year range from 1 to 9999 :");
        int year = obj.nextInt();
        isLeapYear(year);
        System.out.println("Enter month range from 1 to 12 :");
        int month = obj.nextInt();
        getDaysInMonth(month, year);
        obj.close();
    }
}
