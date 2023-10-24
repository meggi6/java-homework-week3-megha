package javaweek3hw;

/**
 *  Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately
 */
public class Programme_11 {

    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        System.out.println("Numbers divisible by 3:");
        dividedByThree(start, end); // direct calling static method
        System.out.println("Numbers divisible by 5:");
        dividedByFive(start, end); // direct calling static method
    }

    // Method to print numbers divisible by 3
    public static void dividedByThree(int start, int end) {
        if (start <= end) {
           if (start % 3 == 0) {
               System.out.print(start + " ");
           }
            dividedByThree(start + 1, end);
       }
    }

    // Method to print numbers divisible by 5
    public static void dividedByFive(int start, int end) {
        if (start <= end) {
            if (start % 5 == 0) {
                System.out.print(start + " ");
            }
            dividedByFive(start + 1, end);
        }
    }
}
