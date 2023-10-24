package javaweek3hw;

import java.util.Scanner;

/**
 *  WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 */

public class SalarySlipOfEmployee {

    public static void salary() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter employee ID :");
        int id = obj.nextInt();
        System.out.println("Enter employee name :");
        String name = obj.next();
        System.out.println("Enter employee basic salary :");
        int salary = obj.nextInt();
        double hra = (salary * 10) / 100;
        double da = (salary * 8) / 100;
        double ta = (salary * 9) / 100;
        double pf = (salary * 20) / 100;
        double grossSalary = salary + hra + da + ta -pf;
        obj.close();

        System.out.println(" ____________________________");
        System.out.println("|       SALARY SLIP          |");
        System.out.println("|____________________________|");
        System.out.println("|  Employee ID     :  "+id+"       |");
        System.out.println("|  Employee Name   :  "+name+"    |");
        System.out.println("|____________________________|");
        System.out.println("|  Basic Salary     :  "+salary+"       |");
        System.out.println("|  HRA 10%    :  "+hra+"    |");
        System.out.println("|  TA 8%     :  "+ta+"       |");
        System.out.println("|  DA 9%   :  "+da+"    |");
        System.out.println("|  PF 20%     :  "+pf+"       |");
        System.out.println("|____________________________|");
        System.out.println("|  Gross Salary    :  "+grossSalary+"    |");
        System.out.println("|===================================|");
    }

    public static void main(String[] args) {
        salary();
    }

}
