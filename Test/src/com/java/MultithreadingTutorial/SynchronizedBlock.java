package com.java.MultithreadingTutorial;

class Display3 {
	public  synchronized void wish(String name) {
		for(int i=0;i<10;i++) {
			try {
				System.out.println("Good Morning ");
				Thread.sleep(1000);
				System.out.println(name);
			}catch(InterruptedException e) {}
		}
	}
}



class MyThread15 extends Thread{
	Display3 d;
	String name;
	MyThread15(Display3 d,String name){
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
		}
}


class MyThread16 extends Thread{
	Display3 d;
	String name;
	MyThread16(Display3 d,String name){
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
		}
}



public class SynchronizedBlock {
	public static void main(String[] args) {
		Display3 d = new Display3();
		//Display3 d1 = new Display3();
		MyThread15 t = new MyThread15(d,"chandra");
		MyThread16 t2 = new MyThread16(d,"kohli");
		t.start();
		t2.start();
		}
}

