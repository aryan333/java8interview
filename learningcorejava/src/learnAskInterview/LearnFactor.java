package learnAskInterview;

import java.util.ArrayList;
import java.util.List;

public class LearnFactor {
	
	public static void main(String[] args) {
		
		int num=63;
		
		
		
		/*List<Integer> l1=new ArrayList<>();
		
		for(int i=1;i<=num/2;i++) {
			
			if(num%i==0) {
				
				l1.add(i);
			}
			
		}
		
		l1.add(num);
		
		for(Integer i1:l1) {
			
			System.out.print(" "+i1);
		}*/
		
		
         for(int i=1;i<=num/2;i++) {
			
			if(num%i==0) {
				
				System.out.print(" "+i);
				
			}
		}
		
         System.out.println(" "+num);
	}

}
