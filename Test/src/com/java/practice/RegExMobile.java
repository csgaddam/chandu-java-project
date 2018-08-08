package com.java.practice;
import java.util.Scanner;
import java.util.regex.*;
//program to check whether the given number matches the pattern

public class RegExMobile {
	public static void main(String[] args) {
		System.out.println("Enter the number in the given format xxx-xxx-xxxx");
		while(true) {
		Scanner scan = new Scanner(System.in);
		boolean b = Pattern.compile("1?[2-9]{1}[0-9]{2}[-][0-9]{3}[-][0-9]{4}").matcher(scan.next()).matches();
		if(b == false) {
			System.out.println("please enter a valid number");
		}
		else {
			System.out.println("you entered a valid number");
			break;
			}
		scan.close();
		}
	}
}
