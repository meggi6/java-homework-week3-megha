package javaweek3hw;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
 * Commission
 * Sales amount >= 50,000 35%, Sales amount >= 30,000 20%
 * >= 20,000 10%, >= 10,000 5%,
 * < 10,000 2%
 */
public class Sales {
    public void mySales(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter sales ID :");
        int id = obj.nextInt();
        System.out.println("Enter seller's name :");
        String name = obj.next();
        System.out.println("Enter sales amount :");
        int sale = obj.nextInt();
        System.out.println("Enter salary :");
        int salary = obj.nextInt();
        obj.close();

        double commision;
        double cs;
        if (sale>= 50000){
            commision = (sale * 35) / 100;
            cs = commision + salary;
            System.out.println("The salary with commission is: "+cs );
        } else if (sale>=30000) {
            commision = (sale * 20) / 100;
            cs = commision + salary;
            System.out.println("The salary with commission is: "+cs );
        } else if (sale>= 20000) {
            commision = (sale * 10) / 100;
            cs = commision + salary;
            System.out.println("The salary with commission is: "+cs );
        } else if (sale>= 10000) {
            commision = (sale * 5) / 100;
            cs = commision + salary;
            System.out.println("The salary with commission is: "+cs );
        } else if (sale<10000) {
            commision = (sale * 2) / 100;
            cs = commision + salary;
            System.out.println("The salary with commission is: "+cs );
        } else {
            System.out.println("no commission");
        }
    }

    public static void main(String[] args) {
        Sales obj = new Sales();
        obj.mySales();
    }
}
