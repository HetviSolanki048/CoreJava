package com.basic;

import java.util.Scanner;

public class staticvariable {
	
	static int a;
	void setvalue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A :");
		a=sc.nextInt();
	}
	void printvalue()
	{
		System.out.println("A :"+a);
	}
	public static void main(String[] args) {
		
		staticvariable s1=new staticvariable();
		staticvariable s2=new staticvariable();
		staticvariable s3=new staticvariable();
		
		s1.setvalue();
		s2.setvalue();
		s3.setvalue();
		
		s1.printvalue();
		s2.printvalue();
		s3.printvalue();

	}
}
