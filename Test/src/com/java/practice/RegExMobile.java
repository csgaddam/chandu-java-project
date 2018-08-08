package com.java.practice;
import java.util.Scanner;
import java.util.regex.*;
//program to check whether the given number matches the pattern

public class RegExMobile {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("1?[2-9]{1}[0-9]{2}[-][0-9]{3}[-][0-9]{4}");
		System.out.println("Enter the number in the given format xxx-xxx-xxxx");
		boolean b1 = true;
		while(b1) {
		Scanner scan = new Scanner(System.in);
		boolean b = p.matcher(scan.next()).matches();
		if(b == false) {
			System.out.println("please enter a valid number");
		}
		else {
			System.out.println("you entered a valid number");
			b1 = false;
			scan.close();
			}
		}
	}
}
