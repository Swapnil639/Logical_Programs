package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How ");
        int n=scanner.nextInt();
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(a);
        System.out.println(b);

        while (n!=0) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            n--;
        }

    }
}
