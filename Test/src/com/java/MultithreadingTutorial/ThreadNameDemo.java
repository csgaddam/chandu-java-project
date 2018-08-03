package com.java.MultithreadingTutorial;
//Threads by default get some random names in java


class MyThread2 extends Thread{
	public void run() {
		//System.out.println("Hi");
		Thread.currentThread().setName("my Thread");//To set the name of the thread
		System.out.println("This thread is executing "+Thread.currentThread().getName());//to get the name of the current thread
	}
}
public class ThreadNameDemo {
	public static void main(String[] args) {
	MyThread2 t = new MyThread2();
	t.start();
	//System.out.println("hello");
	Thread.currentThread().setName("Java Thread");
	System.out.println("This thread is executing "+Thread.currentThread().getName());
	}
}
