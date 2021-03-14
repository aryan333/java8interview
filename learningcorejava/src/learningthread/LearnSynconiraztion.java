package learningthread;

class Counter{
	
	int count;
	public  void inc() {
		
       count++;
	}
}


class MyThread extends Counter implements Runnable{
	
	
	public synchronized void run() {
		
		for(int i=1;i<=1000;i++) {
			
			inc();
		}
	}
}

public class LearnSynconiraztion extends Thread {
	

	public static void main(String[] args) throws InterruptedException {
		
		
		MyThread mt1=new MyThread();
		//MyThread mt2=new MyThread();
		
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt1);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(mt1.count);
		

	}

}
