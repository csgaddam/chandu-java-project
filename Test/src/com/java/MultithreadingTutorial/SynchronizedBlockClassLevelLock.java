
package com.java.MultithreadingTutorial;
/*
 * To get class level lock when using synchronized blocks
 */
class DisplayDemo1{
	public void wish(String name) {
		synchronized(DisplayDemo1.class) {
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
		synchronized(DisplayDemo.class) {
		for(int i=0;i<10;i++) {
			try {
			System.out.println(i);
			Thread.sleep(1000);
			}catch(InterruptedException e) {}
			}
		}
	}
}


class MyThread18 extends Thread{
	DisplayDemo1 d;
	String name;
	MyThread18(DisplayDemo1 d,String name){
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}
	

class MyThread17 extends Thread{
	DisplayDemo1 d;
	MyThread17(DisplayDemo1 d){
		this.d = d;
	}
	public void run() {
			d.numbern();
		}
}



public class SynchronizedBlockClassLevelLock {
	public static void main(String[] args) {
		DisplayDemo1 d = new DisplayDemo1();
		DisplayDemo1 d1 = new DisplayDemo1();
		MyThread18 t1 = new MyThread18(d,"chandu");
		MyThread17 t2 = new MyThread17(d1);
		t1.start();
		t2.start();
	}

}
