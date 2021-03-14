package learnErrorHandle;

public class LearnThrow1 {
	
	public static void div(int a,int b) throws ArithmeticException,NullPointerException{
		
		if(b==0) {
			
		throw new ArithmeticException();
		}
		
		int c=a/b;
		
		System.out.println(c);
		
		
	}

	public static void main(String[] args) {
		
		try {
			
			div(4,0);
			
		}catch (ArithmeticException e) {
			
			System.out.println("Number is not divide by zero");
		}
	}
}
