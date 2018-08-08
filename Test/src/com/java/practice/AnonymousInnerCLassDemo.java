package com.java.practice;

public class AnonymousInnerCLassDemo {
	public static void main(String[] args) {
		// Creating a thread with anonymousInnerClass that extends a class
		Thread t = new Thread()
		// the object created is child object i.e anonymous class object with parent
		// refernce
		{
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("inner Thread");
				}
			}
		};
		t.start();
		
		
		// implementing a runnable interface and executing the run method of the
		// RUnnable Interface
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Runnable thread");
			}
		};
		Thread t2 = new Thread(r);
		t2.start();

		//this loop will be executed by main thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Outer thread");
		}
	}
}
