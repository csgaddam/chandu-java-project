/*
 		program on join method in MultiThreading
 */
class MyThread8 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadJoinDemo {
	public static void main(String[] args) throws InterruptedException {  
		/*
		  other threads may disturb main thread while waiting,so there is a chance of raising Interrupted Exception.since IE is
		  a checked exception,we should handle the exception either by using try-catch block or by using throws keyword.
		 */
		MyThread8 t = new MyThread8();										
		t.start();
		//t.join();						//main thread will wait till the execution of MyThread8
		t.join(5000);					//main thread will wait for 10000 milliseconds and then go to the rady/runnable state
		for(int i=0;i<10;i++) {
			System.out.println("parent thread");
		}
	}

}
