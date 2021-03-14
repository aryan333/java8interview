package learnString;

import java.util.Scanner;

public class LearnString1 {
	
	
	public static void main(String[] args) {
		
		System.out.println("Input two  string");
		
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		// change upper case in string
		s1=s1.toUpperCase();
		
		//Concat string 
		
		String s3=s1.concat(s2);
		
		// length of string
		
		int l1=s1.length();
		int l2=s2.length();
		
		System.out.println("First string length is "+l1);
		System.out.println("Second string length is "+l2);
		
		
		
		System.out.println("Councat String is : "+s3);
	}

}
