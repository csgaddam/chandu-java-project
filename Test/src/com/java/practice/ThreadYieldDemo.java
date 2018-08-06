package com.java.practice;
/*
 		Yeild method pauses the execution of current thread,if there is any other thread of the same 
 		priority waitng to get the processor,Threadscheduler gives the chance to those processor.
 		if the priority of the waiting thread is low/there are no waiting threads then the current thread 
 		will continue executing.
 */


class MyThread6 extends Thread{
	public void run() {
		for(int i=0;i<8;i++) {
			System.out.println("child thread");
			Thread.yield();						//child thread yields and gives the chjance to mian thread
		}										//because child and main thread have the same priority here.
	}
}
public class ThreadYieldDemo {
	public static void main(String[] args) {
		MyThread6 t = new MyThread6();
		t.start();
		for(int i=0;i<8;i++) {
			System.out.println("main thread");
		}
	}
}
