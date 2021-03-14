package learningthread;

class MythreadDemo extends Thread {
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Hii");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class MythreadDemp1 extends Thread {
	
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

public class LeanThread1 {
	
	public static void main(String[] args) {
		
		MythreadDemo md=new MythreadDemo();
		MythreadDemp1 md1=new MythreadDemp1();
		
		md.start();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		md1.start();
		
		
	}

}
