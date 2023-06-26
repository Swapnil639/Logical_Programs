package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int temp=number;
        int sum=0;
        for (int i = 1; i <temp; i++) {
            if (temp%i==0){
                System.out.println(i);
               sum=sum+i;
            }
        }
        System.out.println("Sum of Positive divisors : "+sum);
        if (number==sum){
            System.out.println(number+" is Perfect number");
        }else {
            System.out.println(number+" is not Perfect number");
        }
    }
}
