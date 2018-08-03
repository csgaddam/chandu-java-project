
class MyRunnable implements Runnable{
	public void run() {
		System.out.println("runnable thread");
	}
}

public class RunnableThreadDemo {
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);		
/*
 	Runnable only contains abstract run method.so we should implement that method.
 	Runnable does not contain start method.so create a new thread object using thread class
 	and pass the runnable reference to that thread object constructor.Therefore the runnable 
 	run method will be executed. 
 */
		//Thread t1 = new Thread();
		t.start();
		System.out.println("main thread1");
		
	}
}
