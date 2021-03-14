package learnArray;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {
	
	public static void main(String[] args) {
		
		int[] array= {1,2,3,2,4,5,1};
		Set<Integer> set=new HashSet();
		
		
		// it is first way
		for(int i=0;i<array.length;i++) {
			
			if(set.add(array[i])) {
				
			}else {
				System.out.println(array[i]);
			}
		}
		
		//second way
		int count[]=new int[(array.length)];
		
		for(int i=0;i<array.length;i++) {
			
			 if(count[array[i]]!=0) {
				 System.out.println(array[i]+" ");
			 }else {
				 count[array[i]]++;
			 }
			
		}
		
     // third way 
				
	}

}
