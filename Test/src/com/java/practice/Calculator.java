package com.java.practice;
import java.util.Scanner;

class CustomException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CustomException(String s){
	super(s);
	}
}

class Calculator {
	static int z;
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int a,int b) {
		return a-b;
	}
	
	public float division(float a,float b) {
		return a/b;
	}	
	public int multiply(int a,int b) {
		return a*b;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		
		Calculator c = new Calculator();
		
		int x = c.add(n1,n2);
		System.out.println("The answer is:"+x );
		
		int y = c.subtract(n1,n2);
		System.out.println("The answer is:"+y );
		
		try {
			z = (int)c.division(n1,n2);
		}catch(ArithmeticException e) {
			System.out.println("please enter a valid number");
		}
		System.out.println("The answer is:"+z );
		
		float z1 = c.multiply(n1,n2);
		System.out.println("The answer is:"+z1 );
	}
}

