package learnAskInterview;

class A{
	
	void run() {
		
		System.out.println(" A is running");
	}
}

class B{
	
	void run() {
		
		System.out.println(" B is running");
	}
}

public class LearnObj {
	
	public static void main(String[] args) {
	
	A a=new A();
	B b=new B();
	
	a.run();
	b.run();
	
	//a=b; // can not B to A it is learning concept
	
	}

}
