package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Enter Alphabet");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        VowelOrConsonant vc = new VowelOrConsonant();
        vc.alphabet(ch);
    }

    public void alphabet(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel is:" +ch);
        }
        else {
            System.out.println("Consonant is:" +ch);
        }
    }
}
