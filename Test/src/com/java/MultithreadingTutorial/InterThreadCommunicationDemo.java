package com.java.MultithreadingTutorial;

class ThreadB extends Thread{
	int total = 0;
	public void run() {
		for(int i=1;i<=100;i++) {
			total = total+i;
			}
		synchronized(this){
		this.notify();
			}
		}
	}

public class InterThreadCommunicationDemo {
	public static void main(String[] args)throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		synchronized(b){
		b.wait();
		}
		System.out.println(b.total);
	}

}
