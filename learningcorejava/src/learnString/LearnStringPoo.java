package learnString;

public class LearnStringPoo {
	
	public static void main(String[] args) {
		
		String str="Hello";
		
		 str=str.concat("good");
		
		
		System.out.println(str);
		
		String str2="HelloDad";
		String str3="HelloDad";
		String str4=new String();
		str4="HelloDad";
		
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
	}

}
