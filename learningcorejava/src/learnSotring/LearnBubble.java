package learnSotring;

public class LearnBubble {
	
	public static void main(String[] args) {
		
		int[] a= {5,11,7,15,4,3,2}; // is sort sabsai badai number ko last mai lata hai through adjecent compare
		int temp;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length-1;j++) {
				
				if(a[j]>a[j+1]) {
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(" "+a[i]);
		}
	}

}
