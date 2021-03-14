package learnAskInterview;

class TestStatic{
	
	static void main() {
		
		System.out.println("in block");
	}
	
	static {
		
	    main();
	}
	}


public class LearnStatic22 extends TestStatic {
	
	TestStatic t1=new TestStatic();
	
	public static void main(String[] args) {
		
		
	}

}
