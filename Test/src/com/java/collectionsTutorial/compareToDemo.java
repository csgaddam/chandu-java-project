package com.java.collectionsTutorial;
/*
 * if the first object is less than second then the return value is -ve
 * if the first object is greater than second then the return value is +ve
 * if the first object equal to the second then the return value is 0
 * compareTo is a method present in comparable interface which is present in java.lang package
 */

public class compareToDemo {
	public static void main(String[] args) {
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("A"));
		System.out.println("A".compareTo("A"));
	}

}
