package learnAskInterview;

import java.util.Scanner;

public class LearnCheckStringPalidrom {
	
	public static void main(String[] args) {
		
		System.out.println("Enter string to check to palidrom");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
		}
		
		
		if(s.equalsIgnoreCase(rev)) {
			
			System.out.println("String is palidrom");
		}
		
		else {
			
			System.err.println("String is not palidrom");
		}
		
		String name="Aryan";
		String rev1="";
		for(int i=name.length()-1;i>=0;i--){
		char c=name.charAt(i);
		rev1=rev1+c;
		}
		System.out.println(rev1);
	}

}
