package learnAskInterview;

class TestB {
	
	static {
		
		System.out.println("in b class");
	}
	
	static class Inner {
		
		static {
			
			System.out.println("in inner class");
		}
		
	}
	
	TestB(){
		System.out.println("in constructor");
	}
}

public class LearnStaticblock {
	
	static {
		
		System.out.println("In static block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("In main method");
		
		TestB t1=new TestB();
		TestB t2=new TestB();
	}

}
