package learnLogicPattern;

public class LearnArraySubset {
	
	static boolean isSubset(int arr1[],int arr2[],int m,int n) {
		
		int i;
		int j;
		
		for(i=0;i<n;i++) {
			
			for(j=0;j<m;j++) {
				
				if(arr2[i]==arr1[j]) {
					
					break;
				}
				
				
			}
			
			if(j==m) {
				
				return false;
			}
			
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		int arr1[] = {11,2,7,6,5,8,9};
		
		int arr2[] = {2,11} ;
		
		// check arr2[] is subset of arr1[]
		
		int m=arr1.length;
		int n=arr2.length;
		
		if(isSubset(arr1, arr2, m, n)) {
			
			System.out.println("true");
		}
		else {
			
			System.out.println("false");
		}
		
	}

}
