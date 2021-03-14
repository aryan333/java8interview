package learnAskInterview;

interface Test33{
	
	default void  interest() {
		
		System.out.println("giiviing 8 %");
	}
}

interface Test55{
	
	default void  interest() {
		
		System.out.println("giiviing 10 %");
	}
}

public class LearnInterfaceDefault implements Test33,Test55  {
	
	
	
	public static void main(String[] args) {
		
		LearnInterfaceDefault d1=new LearnInterfaceDefault();
		d1.interest();
		
	}

	@Override
	public void interest() {
		
		//Test55.super.interest();
		System.out.println("My modification");
	}

	

}
