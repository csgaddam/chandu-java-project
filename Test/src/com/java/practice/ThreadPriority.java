package com.java.practice;
/*
		The default priority of main thread id 5.for all other threads the default priority
		is inherited from the parent.In this example the priority of MyThread5 is same as the 
		main thread because main thread is executing the MyThread5. 
*/

/*
  		some operating systems won't provide support for thread priorities.that's the reason we 
  		are not getting expected output.
*/

class MyThread5 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child  thread");
			}
		//System.out.println("The child thread priority is "+Thread.currentThread().getPriority());
	}
}
public class ThreadPriority {
	public static void main(String[] args) {
		MyThread5 t = new MyThread5();
		t.setPriority(10);
		t.start();
		for(int i=0;i<4;i++) {
		System.out.println("parent thread");
		}
		//System.out.println("The main thread priority is "+Thread.currentThread().getPriority());
	}

}
