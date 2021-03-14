package learnString;

import java.util.Scanner;

public class LearnStringRev {
	
	public static void main(String[] args) {
		
		
		String org;
		String rev="";
		
		System.out.println("Enter String");
		
		Scanner sc=new Scanner(System.in);
		org=sc.nextLine();
		
		// through own logic we reverse String
		
		/*for(int i=org.length()-1;i>=0;i--) {
			
			rev=rev+org.charAt(i);
			
		}*/
		
		
		// java inbulit method or api
		
		StringBuffer sb=new StringBuffer(org);
		rev=sb.reverse().toString();
		
		System.out.println("Reverse String is :"+rev);
			
			
		
		
	}

}
