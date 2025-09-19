package com;

import java.util.Scanner;

public class SIP_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid = true;
        while (valid) {
            try {
                System.out.print("Enter your principle amount : ");

                int pa = sc.nextInt();
                System.out.print("Enter your CAGR : ");
                int ir = sc.nextInt();
                System.out.print("Enter your Tenure : ");
                int t = sc.nextInt();
                valid = false;
                double Total = pa;
                for (int i = 0; i < t; i++) {
                    Total = Total + (Total * ir) / 100;
                }
                System.out.println("Total amount is : " + Total);
            } catch (Exception e) {
                System.out.println("Not allowed - Please enter valid numbers");
                sc.nextInt(); // Clear the invalid input from buffer
            }
        }
    }
}

