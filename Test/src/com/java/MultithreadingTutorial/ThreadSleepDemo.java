package com.java.MultithreadingTutorial;
/*
 * when a sleep method is called on the thread the thread will go 
 * in to the sleep mode for the specified time in milliseconds.
 */
public class ThreadSleepDemo {
	public static void main(String[] args)throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
			Thread.sleep(2000);					//main thread goes in to sleep mode
		}
	}

}
