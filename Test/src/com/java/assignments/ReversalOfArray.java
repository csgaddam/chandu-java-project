package com.java.assignments;

import java.util.Scanner;

public class ReversalOfArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		char[] c = s.toCharArray();
		char[] c1 = new char[s.length()];
		int x = c1.length;
		for (int i = 0; i < c.length; i++) {
			c1[i] = c[x - 1];
			x = x - 1;
		}
		System.out.println(c1);
	}
}
