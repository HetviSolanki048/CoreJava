package com.basic;

public class ImplicitDemo {

	public static void main(String[] args) {
        int numInt = 100;
        double numDouble = numInt;  

        System.out.println("Integer value: " + numInt);  
        System.out.println("Converted to Double: " + numDouble);  

        char letter = 'A'; 
        int charToInt = letter;
        System.out.println("Character 'A' as integer: " + charToInt); 
    }
}
