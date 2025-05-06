package com.basic;


	class P1
	{
		P1()
		{
			System.out.println("P1's Constructor");
		}
		
		void show()
		{
			System.out.println("Show From P1");
		}
	}
	class Q1 extends P1
	{
		Q1()
		{
			System.out.println("Q1's Constructor");
		}
		
		void show()
		{
			super.show();
			System.out.println("Show From Q1");
		}
	}
	class R1 extends Q1
	{
		R1()
		{
			System.out.println("R1's Constructor");
		}
		
		void show()
		{
			super.show();
			System.out.println("Show From R1");
		}
	}

	public class SuparKey {

		public static void main(String[] args) {
			R1 r=new R1();
			r.show();
		}
	}

