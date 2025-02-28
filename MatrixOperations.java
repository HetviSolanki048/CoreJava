package com.basic;


import java.util.Scanner;

	class MatrixOperations {
	    static int[][] addMatrices(int[][] A, int[][] B, int rows, int cols) {
	        int[][] result = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = A[i][j] + B[i][j];
	            }
	        }
	        return result;
	    }

	    static int[][] subtractMatrices(int[][] A, int[][] B, int rows, int cols) {
	        int[][] result = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = A[i][j] - B[i][j];
	            }
	        }
	        return result;
	    }

	    static void displayMatrix(int[][] matrix, int rows, int cols) {
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter number of columns: ");
	        int cols = scanner.nextInt();

	        int[][] matrixA = new int[rows][cols];
	        int[][] matrixB = new int[rows][cols];

	        System.out.println("Enter elements of Matrix A:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrixA[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.println("Enter elements of Matrix B:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrixB[i][j] = scanner.nextInt();
	            }
	        }

	        int[][] sumMatrix = addMatrices(matrixA, matrixB, rows, cols);
	        System.out.println("\nMatrix Addition Result:");
	        displayMatrix(sumMatrix, rows, cols);

	        int[][] differenceMatrix = subtractMatrices(matrixA, matrixB, rows, cols);
	        System.out.println("\nMatrix Subtraction Result:");
	        displayMatrix(differenceMatrix, rows, cols);

	        scanner.close();
	    }
}
