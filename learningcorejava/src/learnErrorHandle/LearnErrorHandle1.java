package learnErrorHandle;

public class LearnErrorHandle1 {
	
	public static void main(String[] args) {
		
		try {
			
			
		int data=50/0;
		
		System.out.println(data);
		
		// if we want to finally block is not excute 
		
		//System.exit(0);
		
		}catch (Exception e) {
			
		}
		
		finally {
			
			System.out.println("Final block is always Excuted");
		}
		
		
		System.out.println("Code is excute");
	}

}
