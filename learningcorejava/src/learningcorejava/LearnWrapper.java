package learningcorejava;

public class LearnWrapper {

	public static void main(String[] args) {
		
		int i=20; // it is premitive
		
		Integer in=new Integer(i); // Boxing or premetive to object
		
		//System.out.println(in);
		
		int j=in.intValue(); // unboxing or object to premitive
		
		
		Integer k=i;  // autoboxing
		
		int l=in; // autounboxing
		

	}

}
