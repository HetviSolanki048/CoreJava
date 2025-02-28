package com.basic;

public class ExplicitDemo {
	public static void main(String[] args) {
        double numDouble = 99.99;
        int numInt = (int) numDouble; 

        System.out.println("Double value: " + numDouble);  
        System.out.println("Converted to Integer: " + numInt);  

        int asciiValue = 65;
        char letter = (char) asciiValue; 
        System.out.println("Integer 65 as Character: " + letter);  
    }


}
