package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class QuotientAndReminder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("enter devident : ");
        int devident=scanner.nextInt();
        System.out.print("enter divisor : ");
        int divisor=scanner.nextInt();

        int quotient=devident/divisor;
        System.out.println("Quotient = "+quotient);

        int remainder=devident%divisor;
        System.out.println("Remainder = "+remainder);
    }
}
