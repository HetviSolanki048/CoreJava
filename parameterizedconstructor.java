package com.basic;

public class parameterizedconstructor {

	class Car {
	    
	    String brand;
	    String model;
	    int year;

	    
	    Car(String brand, String model, int year) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	    }

	   
	    void display() {
	        System.out.println("Car Brand: " + brand);
	        System.out.println("Car Model: " + model);
	        System.out.println("Manufacturing Year: " + year);
	    }

	    public static void main(String[] args) {
	        
	        Car car1=new Car("Toyota", "Corolla", 2022);
	        Car car2=new Car("Honda", "Civic", 2023);

	      
	        car1.display();
	        car2.display();
	    }
}
}