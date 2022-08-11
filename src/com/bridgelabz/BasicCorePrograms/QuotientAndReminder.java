package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class QuotientAndReminder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter devident : ");
        int devident=scanner.nextInt();
        System.out.print("Enter divisor : ");
        int divisor=scanner.nextInt();

        int quotient=devident/divisor;
        System.out.println("Quotient = "+quotient);

        int remainder=devident%divisor;
        System.out.println("Remainder = "+remainder);
    }
}
