package learnAskInterview;

public class StringBuff {
	
	public static void main(String[] args) {
		
		String str="this is called";
		
		StringBuffer string=new StringBuffer(str);
		string.delete(4, 7);
		
		System.out.println(string);
		
		string.deleteCharAt(0);
		
		System.out.println(string);
	}

}
