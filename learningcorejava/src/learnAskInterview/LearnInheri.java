package learnAskInterview;

class CheckA{
	
	private int a;
	public int b;
	protected int c=5;
}

class CheckB extends CheckA{
	
	private int d;
	public  int e;
	protected int f;
	
}

class C extends CheckB{
	
	void display() {
		
		System.out.println(c);
	}
}

public class LearnInheri {

	public static void main(String[] args) {
		
		C c=new C();
		c.display();
		
		

	}

}
