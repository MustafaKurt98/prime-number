package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a =0;
        System.out.println("enter a number");
        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();
        if (sayi==1){
            System.out.println("prime numbers are greater than 2");
        }else{
            for (int i=2; i<=sayi/2;i++){
                if (sayi%i==0) {
                    a++;
                }
            }
            if (a==0)
                System.out.println(sayi+" is a prime number");
            else
                System.out.println(sayi+" is not a prime number");
        }
    }
}
