package com.basic;

abstract class Abs1
{
	void meth1()
	{
		System.out.println("meth1");
	}
	abstract void meth2();   
	
	
}
class Abs2 extends Abs1
{
	void meth2()
	{
		System.out.println("meth 2 in Abs2 ");
	}
}

public class abstractclass {

	public static void main(String[] args) {
		Abs2 a=new Abs2();
		a.meth1();
		a.meth2();
		
	}
	

}
