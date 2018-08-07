package com.java.practice;

public class StaticDemo {
	static int num = 10;

	public int call() {
		int i = num + 10;
		return i;
	}

	public static void main(String[] args) {
		System.out.println(num);
		StaticDemo d = new StaticDemo();
		int i = d.call();
		System.out.println(i);
	}

}
