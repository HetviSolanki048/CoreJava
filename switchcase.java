package com.basic;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A :");
		a=sc.nextInt();
		System.out.print("Enter B : ");
		b=sc.nextInt();
		
		System.out.println("1.Addition ");
		System.out.println("2.Subtraction");
		System.out.println("3.multipliction");
		System.out.println("4.Divison");
		System.out.println("Enter you choice : ");
		d=sc.nextInt();
		
		switch(d)
		{
		    case 1:
		    	c=a+b;
		    	System.out.println("Addition : "+c);
		    	break;
		    case 2:
		    	c=a-b;
		    	System.out.println("subtraction : "+c);
		    	break;
		    case 3:
		    	c=a*b;
		    	System.out.println("multiplication: "+c);
		    	break;
		    case 4:
		    	c=a/b;
		    	System.out.println("divison: "+c);
		    	break;
		    default:
		    	System.out.println("Invlid choice");
		    	break;
		}
				
	}
}
