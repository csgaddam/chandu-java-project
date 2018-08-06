package com.java.assignments;

import java.util.Scanner;

class Pyramid {
	public static void main(String[] args) {
		int size = 0;
		System.out.println("Enter the number of rows");
		Scanner scan = new Scanner(System.in);
		size = scan .nextInt();
		scan.close();
		int colnum = 1;
		int spacecount = size-1;
		for (int i = 1; i <= size; i++) {
			int k = 0;
			for (int j = 0; j <= spacecount; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= colnum; j++) {
				if (j <= i) {
					k++;
				} else {
					k--;
				}
				System.out.print(k);
			}
			System.out.println(" ");
			colnum = colnum + 2;
			spacecount--;
		}
	}
}