package learnArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LearnFreqCountOptimizeway {
	
	public static void main(String[] args) {
		
		// first way
		int[] array= {1,1,2,2,2,3,3,4,4,4,4,5,6,6,7,7,7};
		int freq=1;
		int i;
		for(i=1;i<array.length;i++) {
			if(array[i]==array[i-1]) {
				++freq;
			}else {
				System.out.println("Frequency of "+array[i-1]+"is "+freq);
				freq=1;
			}
	  }	
		System.out.println("Frequency of "+array[i-1]+" is "+freq);
		
		
		// second way first sort array then apply above 
		int[] array1= {1,2,1,2,4,4,3,5,4,3,6,4,7};
		Arrays.sort(array1);
		for(int a:array1) {
			System.out.println(a);
		}
		
		// conver int array to arraylist
		int[] array3= {1,2,1,3};
		List<Integer> list=Arrays.stream(array3).boxed().sorted().collect(Collectors.toList());
		System.err.println(list);
		
		
		
	}

}
