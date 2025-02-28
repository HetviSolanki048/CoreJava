package com.basic;

public class Studentconstructor {
	 private String name;
	    private int age;

	    public Studentconstructor () {
	        this.name = "Unknown";
	        this.age = 0;
	    }
	    public Studentconstructor (String name) {
	        this.name = name;
	        this.age = 0;
	    }
	    public Studentconstructor (String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    public void displayDetails() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Student Age: " + age);
	    }
	    public static void main(String[] args) {
	    	Studentconstructor  student1 = new Studentconstructor ();
	    	Studentconstructor  student2 = new Studentconstructor ("Hetvi");
	    	Studentconstructor  student3 = new Studentconstructor ("Harshil panchal", 20);

	        student1.displayDetails();
	        student2.displayDetails();
	        student3.displayDetails();
	    }
}
