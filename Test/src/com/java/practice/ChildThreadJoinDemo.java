package com.java.practice;


/*
 *The thread1 that wants to wait till the execution of thread2
 * should call the join method on thethread2.And the thread1 method 
 * should throw InterruptedException and it should be handled in try-catch block.
 */



class MyThread9 extends Thread{
	public void run()  {
		 try {
			ChildThreadJoinDemo.mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
	}
}
public class ChildThreadJoinDemo {
	static Thread mt;
	public static void main(String[] args)throws InterruptedException{
		mt = Thread.currentThread();		
		MyThread9 t = new MyThread9();
		t.start();
		//t.join();  what happens if we call join method on both child and main threads at the same time
		for(int i=0;i<10;i++) {
			System.out.println("parent thread");
		}
	}

}


//when happens when a join method is called on the mainthread,when it is the only thread in the program
/*
	class ThreadJoinDemo{
		public static void main(Strin[] args)throws InterruptedExcption{
			Thread.currentThread.join();
		}
	}
*/