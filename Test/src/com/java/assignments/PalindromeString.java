package com.java.assignments;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		scan.close();
		if (s1.equals(new StringBuffer(s1).reverse().toString()))// code to revere the string
			System.out.println("The given string is a palindrome");
		else
			System.out.println("The given String is not palindrome");
	}
}