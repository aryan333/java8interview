package learnString;

public class LearnStringpool {
	
	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="Hello";
		String s3="He"+"llo";
		String s4=new String("Hello");
		String s5=new String("Hello");
		String s7="Data";
		s7="Dataone";
		//s4="good";
		
		 //s1="ball";
		
		System.out.println(s1==s4);
		System.out.println(s1.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s1.equals(s4));
		System.out.println(s1==s2);
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
	}

}
