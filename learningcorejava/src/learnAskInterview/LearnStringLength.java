package learnAskInterview;

public class LearnStringLength {
	
	public static void main(String[] args) {
		
		int length=0;
		
		String s="Aryan";
		int i=0;
		
		for(Character c:s.toCharArray()) {
			
			i++;
		}
		
		System.out.println(i);
	}

}
