package learnSotring;

public class LearnInsertion {
	
	public static void main(String[] args) {
		
		int[] a= {11,5,7,15,4,3,2}; // ismai key tak sort kartai hai
		
		for(int i=1;i<a.length;i++) {
			
			int key=a[i];
			int j=i-1;
			
			while(j>=0 && a[j]>key) {
				
				a[j+1]=a[j];
				j--;
			}
			
			a[j+1]=key;
		}
		
		for(int i=1;i<a.length;i++) {
			
			System.out.print(" "+a[i]);
		}
	}

}
