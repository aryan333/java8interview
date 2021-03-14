package learnStream;

import java.util.stream.IntStream;

public class LearnStream1 {
	
	public static void main(String[] args) {
		
		int a[]= {3,5,4,1,2};
		int min1=a[0];
		
		// it is general way 
		for(int i=0;i<a.length;i++) {
			
			if(min1>a[i] ){
				
				min1=a[i];
				
			}
		}
		
		// through stream 
		//int mins=IntStream.of(a).min().getAsInt();
		
		// if array is empty 
		
		IntStream.of(a).min().ifPresent(min -> System.out.println(min)); // it through lambada and stream
		IntStream.of(a).min().ifPresent(System.out::println);  // it is through static method refernces and stream
		
		
		//System.out.println("minimum nuber is "+mins);
	}

}
