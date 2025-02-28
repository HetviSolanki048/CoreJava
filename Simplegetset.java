package com.basic;

public class Simplegetset {
	 private String name;
	    private int age;

	    public Simplegetset() {
	        this.name = "Unknown";
	        this.age = 0;
	    }

	    public Simplegetset(String name) {
	        this.name = name;
	        this.age = 0;
	    }

	    public Simplegetset(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void displayDetails() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Student Age: " + age);
	    }

	    public static void main(String[] args) {
	    	Simplegetset student1 = new Simplegetset();
	    	Simplegetset student2 = new Simplegetset("Hetvi");
	    	Simplegetset student3 = new Simplegetset("Harshil panchal", 20);

	        student1.displayDetails();
	        student2.displayDetails();
	        student3.displayDetails();

	        student1.setName("Harvi");
	        student1.setAge(20);

	        System.out.println("Updated Student 1 Details:");
	        student1.displayDetails();
	    }

}
