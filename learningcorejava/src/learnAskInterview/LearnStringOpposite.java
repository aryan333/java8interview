package learnAskInterview;

import java.util.ArrayList;
import java.util.List;

public class LearnStringOpposite {
	
	public static void main(String[] args) {
		
		String str="My name is Rahul";
		
		char[] c=str.toCharArray();
		
		
		StringBuilder builder=new StringBuilder();
		
		List list=new ArrayList<>();
		
		for(int i=0;i<c.length;i++) {
			
			char c1=c[i];
			if(c1==' ' || i==c.length-1) {
				
				builder.append(c1);
				
				if(i==c.length-1) {
					builder.append(' ');
				}
				list.add(builder);
			    builder=new StringBuilder();
			}
			
			else {
				
				builder.append(c1);
			}
		}
		
       for(int j=list.size()-1;j>=0;j--) {
			
			System.out.print(list.get(j));
		}
		
		// second way 
		System.out.println();
		String[] words=str.split(" ");
		
		for(int j=words.length-1;j>=0;j--) {
			System.out.print(words[j]+" ");
		}
	}

}
