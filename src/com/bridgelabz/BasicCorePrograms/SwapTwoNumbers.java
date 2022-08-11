package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the value of a & b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        SwapTwoNumbers swapNo = new SwapTwoNumbers();
        swapNo.swapping(a , b);
    }


    public void swapping(int a , int b){
        System.out.println("before swapping of two numbers" + a + " " + b);
        int swap = a;
        a = b;
        b = swap;
        System.out.println("after swapping of two number" + a + " " + b);
    }
}
