//program to send wishes to certain person
class Display{
	//what happens if we declare the below method as public static synchronized
	 public synchronized void wish(String name) {
		try {
			for(int i=0;i<4;i++) {
				System.out.println("Good morning: ");
				Thread.sleep(1000);
				System.out.println(name);
				}
			}catch(InterruptedException e) {}
	}
}

//sending the wishes indirectly using threads
class MyThread11 extends Thread{
	Display d;
	String name;
	MyThread11(Display d,String name){
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}


//Multiple threads accesing display onject at the same time
public class SynchonizedDemo {	
	public static void main(String[] args) {
		Display d = new Display();
		
	MyThread11 t1 = new MyThread11(d,"chandra");
	MyThread11 t2 = new MyThread11(d,"dhoni");
	//MyThread11 t3 = new MyThread11(d,"kohli");
	t1.start();
	t2.start();
	//t3.start();
	}
}
