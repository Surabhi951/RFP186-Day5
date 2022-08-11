package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args){
        int tails = 0;
        int heads = 0;
        System.out.println("Enter the no of times to flip coin");
        Scanner sc = new Scanner(System.in);
        int flips = sc.nextInt();
        for(int i=0; i<flips; i++){
            if (Math.random() < 0.5){
                tails++;
            }
            else {
                heads++;
            }

        }
        System.out.println("Number of Head flips: "+heads);
        System.out.println("Number of Tail flips: "+tails);
        double headsPercent = (double)heads/flips*100;
        double tailsPercent = (double) tails/flips*100;
        System.out.println("percentage of heads:" +headsPercent);
        System.out.println("percentage of tails:" + tailsPercent);
    }

}
