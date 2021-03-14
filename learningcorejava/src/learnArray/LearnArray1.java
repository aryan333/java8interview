package learnArray;

public class LearnArray1 {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,1,5,6,3,1,6};
		
		int[] b= {0,0,0,0,0,0,0,0,0};
		
		for(int i=0;i<a.length;i++) {
			
			b[a[i]]++;
		}
		
		for(int i=0;i<b.length;i++) {
			
			if(b[i]!=0) {
				
				System.out.println(i+" "+b[i]);
			}
			
		
	}
	}

}
