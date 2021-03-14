package learnAskInterview;

public class LearnLongestPanildrome {
	
	public static void main(String[] args) {
		
		String s="1223213";
		
		System.out.println(longPanidrom(s));
		
	}
	
	
	static public String intermediatePanidrom(String s,int left,int right) {
		
		if(left>right) {
			
			return null;
		}
		
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
			
			left--;
			right++;
		}
		
		return s.substring(left+1, right);
		
	}
	
	public static String longPanidrom(String s) {
		
		String longest=s.substring(0, 1);
		
		for(int i=0;i<s.length()-1;i++) {
			
			
			// it is odd case , if case is even intermediatePanidrom(s,i,i+1)
			String panidrom=intermediatePanidrom(s,i,i);
			
			if(panidrom.length()>longest.length()) {
				
				longest=panidrom;
			}
		}
		
		return longest;
	}

}
