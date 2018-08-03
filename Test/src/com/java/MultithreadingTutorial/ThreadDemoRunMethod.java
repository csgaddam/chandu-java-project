package com.java.MultithreadingTutorial;
//Explination of over loading of run method

/*Run method can be overloaded
 but the start method 
 always calls the no-arg run method.*/

//The job of the thread should be explained in the run method
//Thread class start method calls the run method internally
 

class MyThread1 extends Thread{
 
 	public void run() {
		System.out.println("no-arg");
		}
	public void run(int i) {
		System.out.println("int-arg");
		}

/*
 	public void start() {
		System.out.println("start method");
		}
*/
	
/*if we override the start method of thread class,then new threadwon't be created.
	the main thread will execute the atrat method as a normal method.
*/
}
public class ThreadDemoRunMethod {
	public static void main(String[] args) {
		MyThread1 t = new MyThread1();			//creating a new thread
		t.start();								//starting that thread using start method in the thread class
		//t.start();
	}
}

