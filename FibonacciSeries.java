package com.basic;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int n,i,a,b,next;
		Scanner num=new Scanner(System.in);
		System.out.print("Enter the number of terms :");
		n=num.nextInt();
		a=0;
		b=1;
		
		System.out.print("Fibonacci series up to " +n+ "terms:");
		for(i=1;i<=n;i++)
		{
			System.out.println(a +" ");
			
			next=a+b;
			a=b;
			b=next;
			
		}
			
		
	}

}
