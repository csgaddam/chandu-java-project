package com.java.practice;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "chandra";
		s1.concat("sekhar");
		System.out.println(s1);//if the string is mutable then we should get chandra sekhar as output
		StringBuffer sb = new StringBuffer(s1);
		sb.append("sekhar");
		System.out.println(sb);//StringBuffer is mutable so we got the output as chandrasekhar 
	}

}
