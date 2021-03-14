package learnString;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LearnShortStringlenth {
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] sa=s.toCharArray();
		
		Set st=new HashSet<>();
		
		Integer count=0;
		
		for(Character ce:sa) {
			
			if(st.add(ce)) {
				
				count++;
			}
			
			
		}
		
		System.out.println(st + " "+count);
		
		
		
	}

}
