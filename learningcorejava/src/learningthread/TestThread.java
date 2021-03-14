package learningthread;

class TestThread22 extends Thread{
	
	public void run() {
		
		System.out.println("11");
	}
}

public class TestThread  {
	
	public static void main(String[] args) {
		TestThread22 m1=new TestThread22();
	m1.run(); //  yaha koi thread start nahi huaa , so sabsai start method call karna padtaa hai
	
	}
	

}
