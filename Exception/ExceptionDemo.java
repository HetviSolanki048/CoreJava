package com.exception;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		System.out.println("Start code");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter A : ");
			a=sc.nextInt();
			System.out.println("Enter B : ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Divison :"+c);
			int arr[]= {1,2,3,4,5};
			System.out.print("Enter Array Index To Get Value : ");
			int index=sc.nextInt();
			System.out.println("value At Index "+index+" Is :"+arr[index]);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("array : "+a);
		}
		catch()
	}

}
