package com.company.Challenge_1;

public class Main {

    public static int natBelow1000(){
        int sum = 0;

        for (int i=0; i<=1000; i++){
            if(i%3==0 || i%5==0) sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Adding the sum of all Natural numbers below 1000");
        int totalSum = natBelow1000();
        System.out.println("The Total sum is " + totalSum + ".");
    }
}
