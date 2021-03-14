package learningcorejava;

class Adder{

	
	// learn concept method overloading with different parameter
	
   static int add(int a,int b) {
		
		return a+b;
	}
	
	static int add(int a,int b,int c) {
		
		return a+b+c;
	}
	
	//learn concept method overloading with different data type
	
	static int mul(int a,int b) {
		
		return a*b;
	}
	
	static double mul(double a,double b) {
		
		return a*b;
	}
	
	
}

public class LearnMethodOverLoad {
	
 public static void main(String args[]) {
	 
      System.out.println(Adder.add(10, 30));
      System.out.println(Adder.add(20, 40, 80));
      System.out.println(Adder.mul(5, 50));
      System.out.println(Adder.mul(20.11, 11.11));
 }

}
