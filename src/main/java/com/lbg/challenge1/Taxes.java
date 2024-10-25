package com.lbg.challenge1;
import java.util.Scanner;

public class Taxes {

    public static void main(String[] args) {
        int userSalary = userSalaryInput();
        outputTax(userSalary);
    }


    public static int userSalaryInput() {
        /* Retrieves the user inputted salary */
        System.out.println("Enter your salary below:");
        Scanner userSalaryScanner = new Scanner(System.in);
        int userSalary = userSalaryScanner.nextInt();

        return userSalary;
    }


    public static double calculateNetIncome(double userSalary){
        /* Compares the gross income to the income tax brackets */
        double netSalary = userSalary;

        if (userSalary >= 15000 && userSalary <= 19999){
            netSalary *= .9;
        } else if (userSalary >= 20000 && userSalary <= 29999){
            netSalary *= .85;
        } else if (userSalary >= 30000 && userSalary <= 44999){
            netSalary *= .8;
        } else if (userSalary >= 45000){
            netSalary *= .75;
        }

        return netSalary;
    }


    public static void outputTax(double userSalary) {
        /* Outputs the net income */

        System.out.println("You entered your salary as " + Double.toString(userSalary));
        System.out.println();
        double netSalary = calculateNetIncome(userSalary);
        System.out.println("Your net salary (after taxes) is " + Double.toString(netSalary));
    }
}
