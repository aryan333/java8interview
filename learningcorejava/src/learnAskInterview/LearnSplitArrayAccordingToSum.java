package learnAskInterview;

public class LearnSplitArrayAccordingToSum {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,5};
		
		int n=a.length;
		printTwoParts(a,n);
		
		
		
	}
	
	static void printTwoParts(int a[],int n) {
		
		int spiltPoint=findSpiltPoint(a, n);
		
		if(spiltPoint==-1 || spiltPoint==n) {
			
			System.out.println("Not posssible");
		}
		
		for(int i=0;i<n;i++) {
			
			if(spiltPoint==i) {
				
				System.out.println();
			}
			
			System.out.print(a[i]+" ");
		}
	}
	
	static int findSpiltPoint(int a[],int n) {
		
		int leftsum=0;
		
		for(int i=0;i<n;i++) {
			
			leftsum+=a[i];
			
			int rightsum=0;
			
			for(int j=i+1;j<n;j++) {
				
				rightsum+=a[j];
				
			}
			
			if(leftsum==rightsum) {
				return i+1;
			}
		}
		
		return -1;
	}

}
