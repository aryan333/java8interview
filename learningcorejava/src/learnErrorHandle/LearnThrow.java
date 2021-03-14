package learnErrorHandle;

public class LearnThrow {
	
	public static void div(int a,int b) {
		
		int c=1;
		try {
			
			 c=a/b;
			 
			 System.out.println(c);
			
		}catch(Exception ex) {
			
			System.out.println(ex);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		div(4,0);
		
	}

}
