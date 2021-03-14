package learnString;

public class LearnSprinHash {
	
	public static void main(String[] args) {
		
		String s="Suraj";
		
		String s1=new String("Suraj");
		String s2=s1;
		
		System.err.println(s1==s2);
		
		// same hash code is generate
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}
