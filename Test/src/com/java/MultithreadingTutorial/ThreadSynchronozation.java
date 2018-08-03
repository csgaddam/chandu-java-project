package com.java.MultithreadingTutorial;
//There is an another method called static synchronization
/*
 * This class sends the wishes to the mentioned person 
 */
class DisplayDemo{
	public void wish(String name) {
		synchronized(this) {
		for(int i=0;i<10;i++) {
		System.out.println("Good morning: ");
		try {
		Thread.sleep(1000);
		}catch(InterruptedException e) {}
		System.out.println(name);
			}
		}
}
	//This method prints the numbers
	public  void numbern() {
		synchronized(this) {
		for(int i=0;i<10;i++) {
			try {
			System.out.println(i);
			Thread.sleep(1000);
			}catch(InterruptedException e) {}
			}
		}
	}
}


class MyThread13 extends Thread{
	DisplayDemo d;
	String name;
	MyThread13(DisplayDemo d,String name){
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}
	

class MyThread14 extends Thread{
	DisplayDemo d;
	MyThread14(DisplayDemo d){
		this.d = d;
	}
	public void run() {
			d.numbern();
		}
}



public class ThreadSynchronozation {
	public static void main(String[] args) {
		DisplayDemo d = new DisplayDemo();
		MyThread13 t1 = new MyThread13(d,"chandu");
		MyThread14 t2 = new MyThread14(d);
		t1.start();
		t2.start();
	}
}

