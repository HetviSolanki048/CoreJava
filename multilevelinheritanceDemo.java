package com.basic;

public class multilevelinheritanceDemo {
	class Animal {
	    void eat() {
	        System.out.println("Animals eat food.");
	    }
	}

	
	class Mammal extends Animal {
	    void walk() {
	        System.out.println("Mammals walk on land.");
	    }
	}

	
	class Dog extends Mammal {
	    void bark() {
	        System.out.println("Dogs bark.");
	    }
	}

	
	public class MultilevelInheritanceDemo {
	    public static void main(String[] args) {
	       
	        Dog myDog = new Dog();

	        
	        myDog.eat();   
	        myDog.walk();  
	        myDog.bark();  
	    }
}
