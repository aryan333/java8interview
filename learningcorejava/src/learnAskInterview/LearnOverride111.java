package learnAskInterview;

class Abc{

	public void print() {
		
		System.out.println("come here");
	}
}

class Bcd extends Abc{
	
	/*public void print() {
		
		System.out.println("B come here");
	}*/
}

public class LearnOverride111 {
	
	public static void main(String[] args) {
		
	Abc a=new Bcd();	
	a.print();
		
	}

}
