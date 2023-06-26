package com.bridgelabz;

public class StopWatch {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        for (int i = 0; i <=100; i++) {
            System.out.println(i);
        }
        long endTime=System.currentTimeMillis();
        long elapseTime=endTime-startTime;
        System.out.println("Elapse Time : "+elapseTime);
    }
}
