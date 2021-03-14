package learningthread;

class MyThread1 implements Runnable {
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 implements Runnable {
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Learnthread2  {
	
	public static void main(String[] args) {
		
		MyThread1 m1=new MyThread1();
		MyThread2 m2=new MyThread2();
		
		
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		
		t1.start();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		
	}
	
	

}
