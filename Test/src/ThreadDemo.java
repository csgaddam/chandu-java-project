//how to define a thread
class MyThread extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
	}

}
class ThreadDemo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();	//Thread class contains start method
		for(int i=0;i<10;i++) {
			System.out.println("Main thread");
		}
	}
}