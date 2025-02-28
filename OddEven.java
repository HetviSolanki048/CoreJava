package com.basic;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String[] args) {
		int num;
		Scanner n=new Scanner(System.in);
		System.out.print("Enter Number :");
		num=n.nextInt();
		
		if(num %2==0)
		{
			System.out.println(num+" is Even");
		}
		else {
			System.out.println(num+" is odd");
		}
		
	}

}
