package learningcorejava;

public class LearnArray {

	public static void main(String[] args) {
		
		int[] arr=new int[2];
		arr[0]=1;
		arr[1]=2;
		
		int[] arr1= {1,2,3,4};
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]);
			
		}
		
		System.out.println();
		/*for(int i=0;i<arr1.length;i++) {
					
					System.out.print(arr1[i]);
				}*/
		
		// enhanced for loop
		
		for(int k:arr1) {
			
			System.out.print(k);
		}
	}

}
