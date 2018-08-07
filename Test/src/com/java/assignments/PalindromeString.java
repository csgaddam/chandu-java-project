package com.java.assignments;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1 = scan.next();
		StringBuffer sb = new StringBuffer(s1);
		String s2 = sb.reverse().toString();
		if (s1.equals(s2))
			System.out.println("The given string is a palindrome");
		else
			System.out.println("The given String is not palindrome");
		scan.close();
	}
}
