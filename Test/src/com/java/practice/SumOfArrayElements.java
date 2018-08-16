package com.java.practice;

import java.util.Scanner;

public class SumOfArrayElements {
	public  int  sumOfElements(int[] i){
		
		int sum = 0;
		for(int k=0;k<i.length;k++) {
			sum = sum+i[k];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int arraySize = scan.nextInt();
		
		int[] i = new int[arraySize];
		System.out.println("Enter the elements in array:");
		
		for(int j=0;j<arraySize;j++) {
			i[j] = scan.nextInt();
		}
		scan.close();
		SumOfArrayElements sum1 = new SumOfArrayElements();
		System.out.println(sum1.sumOfElements(i));
	}
		
}
