package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        // prompt user for their name and store answer
        System.out.println("Enter your name:");
        Scanner myScanner = new Scanner(System.in);
        String name = myScanner.nextLine();

        // ask and store hours worked from user
        System.out.println("Enter number of hours worked: ");
        double hoursWorked = myScanner.nextInt();

        // ask and store user pay rate
        System.out.println("Enter your pay rate: ");
        double payRate = myScanner.nextInt();

        // calculate gross pay
        double grossPay = hoursWorked * payRate;
        System.out.printf("%s's gross pay is: $%f", name, grossPay);




    }
}
