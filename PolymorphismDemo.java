package com.basic;

	class Animal1 {
	    void sound1() {
	        System.out.println("Animal makes a sound.");
	    }
	}

	class Dog1 extends Animal1 {
	    void sound1() {
	        System.out.println("The dog barks.");
	    }
	}

	class Cat extends Animal1 {
	    void sound1(){
	        System.out.println("The cat meows.");
	    }
	}

	public class PolymorphismDemo {
	    public static void main(String[] args) {
	       Cat c=new Cat();
	       Dog1 D=new Dog1();
	       c.sound1();
	       D.sound1();
	    }
}

