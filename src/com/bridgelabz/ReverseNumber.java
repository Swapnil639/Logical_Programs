package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number : ");
        int number=scanner.nextInt();
        int rem,rev=0;
        while (number!=0){
            rem=number%10;
            rev=rev*10+rem;
            number=number/10;
        }
        System.out.println("Reverse Number : "+rev);
        int n=2;
        int value=(int) Math.sqrt(n);
        System.out.println(value);
    }
}
