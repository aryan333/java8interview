package learnAskInterview;

import java.util.Scanner;

public class StringUpperToLowerAndLowerToUpper {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter a sentence");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Character c;
		String s2="";
		//Character c1;
		
		for(int i=0;i<s.length();i++) {
			
			c=s.charAt(i);
			
			System.out.println(c);
			
            if(c==' ') {
				
				System.out.println("check");
				s2=s2+' ';
			}
			
			if(c>='A'&&c<='Z') {
				
				c=(char) (c+32);
				
				s2=s2+c;
				continue;
				//s=s.replace(c, c1);
			}
			
			if(c>='a'&&c<='z') {
							
			    c=(char) (c-32);
				s2=s2+c;
				continue;
				//s=s.replace(c, c1);
				
			}
			
			
			
		}
		
		System.out.println(s2);
		
		
				
		
		
	}

}
