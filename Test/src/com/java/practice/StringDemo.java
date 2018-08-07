package com.java.practice;

import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		System.out.println("Enter the second string to be concatinated:");
		String s2 = scan.next();
		s1.concat(s2);
		System.out.println("The String class is immutble because the output\n"
				+ " after concatinating the second string with first string is: " + s1);
		StringBuffer sb = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);
		sb.append(sb2);
		System.out.println("The StringBuffer class is immutable because the output\n "
				+ "after appending the second String with the First Sting is: " + sb);
		scan.close();
	}

}
