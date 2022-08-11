package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int M=2;
        int N=3;

        Scanner scanner=new Scanner(System.in);

        int[][] ar=new  int[M][N];
        System.out.println("Enter Numbers : ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("ar["+i+"]["+j+"]= ");
                ar[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Printing Array : ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(ar[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
