package learnAskInterview;

public class JavaCore {
	
	JavaCore(int x){
	   	System.out.println("One arg constructor");
	       }
	JavaCore(){
        System.out.println("No arg constructor");
	}

	static {
		System.out.println("1st static init");
	}
	{
		System.out.println("1st instance init");
	}
	{
		System.out.println("2nd instance init");
	}
	static {
		System.out.println("2nd static initr");
	}
	public static void main(String []args){
	  new JavaCore();
	  new JavaCore(8);
	}	

}
