package com.basic;

public class datamethod {
	void display(int num) {
        System.out.println("Integer: " + num);
    }

    void display(double num) {
        System.out.println("Double: " + num);
    }

    void display(String text) {
        System.out.println("String: " + text);
    }

    void display(int num1, int num2) {
        System.out.println("Sum of Integers: " + (num1 + num2));
    }

    public static void main(String[] args) {
    	datamethod obj = new datamethod();
        
        obj.display(10);
        obj.display(15.5);
        obj.display("Hello, Java!");
        obj.display(5, 7);
    }
}
