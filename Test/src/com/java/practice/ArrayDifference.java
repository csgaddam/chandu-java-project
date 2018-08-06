package com.java.practice;
import java.util.Scanner;
//program to write the difference between the max and min number in an array
public class ArrayDifference{
	public static void main(String[] args) {
		int[] a = new int[4];					//should declare size at the time of declaration
		Scanner scan = new Scanner(System.in);	//to give command line arguments
		a[0] = scan.nextInt();					//first commandline argument is assigned to a[0]
		a[1] = scan.nextInt();					//second commandline argument is assigned to a[1]
		a[2] = scan.nextInt();
		a[3] = scan.nextInt();
		scan.close();							//closing the scanner class
		int max = a[0];
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {						//check if the current number is the max number 
				max = a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min = a[i];
				
			}
		}
		int r = max - min;
		System.out.println("The difference between max number and min number is "+ r);
		
	}
}