package com.java.practice;

import java.util.Scanner;

public class ArrayMinAndMax {
	public static void main(String[] args) {
		int[] i = new int[4];
		int size = i.length;
		int max = i[0];
		Scanner scan = new Scanner(System.in);
		for (int j = 0; j < size; j++) {
			System.out.println("Enter the number in index " + j);
			i[j] = scan.nextInt();
		}
		scan.close();
		for (int k = 0; k < size; k++) {
			if (i[k] > max) {
				max = i[k];
			}
		}
		int min = i[0];
		for (int k = 0; k < size; k++) {
			if (i[k] < min) {
				min = i[k];
			}
		}
		System.out.println("Difference between max and min elements in array is " + (max - min));
	}
}
