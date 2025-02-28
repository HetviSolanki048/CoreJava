package com.Thread;

class NewThread extends Thread
{

	Thread t;
	public NewThread()
	{
		super("child Thread");
		start();
	}
	
	public void run() {
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(this+" : "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread Exiting");
		
	}
	 
}

public class ThreadDemo {
	
	public static void main(String[] args) {
		new NewThread();
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		System.out.println(t);
		t.setPriority(3);
		System.out.println(t);
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" : "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread Exiting");
	}

}
