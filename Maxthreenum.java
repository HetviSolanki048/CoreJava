package com.basic;

import java.util.Scanner;

public class Maxthreenum {
	
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        int max = findMax(num1, num2, num3);
        
        System.out.println("The maximum number is: " + max);
        
        sc.close();
    }
}
