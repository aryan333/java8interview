package learnSotring;

public class LearnSelection {
	
	public static void main(String[] args) {
		
		int[] a= {5,11,7,15,4,3,2}; // is mai sabsai small number ko sabsai phlai  latai hai
		int temp;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			
		System.out.print(" "+a[i]);
		
		}
	}

}
