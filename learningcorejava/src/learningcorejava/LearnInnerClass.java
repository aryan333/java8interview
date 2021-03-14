package learningcorejava;


class Outer{
	
	void display() {
		
		System.out.println("In Outer Display");
	}
	
	class Inner{
		
		void display() {
			
			System.out.println("In inner Class");
		}
	}
	
	static class Ineer1{
		
		static void display() {
			
			System.out.println("Inner static class");
		}
		
	}
}

public class LearnInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// calling outer class
		Outer o1=new Outer();
		
		o1.display();
		
		// calling inner class
		Outer.Inner i1=o1.new Inner();
		
		i1.display();
		
		// calling inner static classs
		
		//Outer.Ineer1.display();
		
		Outer.Ineer1 in=new Outer.Ineer1();
		
		in.display();
		
		

	}

}
