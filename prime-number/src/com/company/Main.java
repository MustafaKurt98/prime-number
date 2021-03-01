package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a =0;
        System.out.println("enter a number");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        if (num==1){
            System.out.println("prime numbers are greater than 2");
        }else{
            for (int i=2; i<=num/2;i++){
                if (num%i==0) {
                    a++;
                }
            }
            if (a==0)
                System.out.println(num+" is a prime number");
            else
                System.out.println(num+" is not a prime number");
        }
    }
}
