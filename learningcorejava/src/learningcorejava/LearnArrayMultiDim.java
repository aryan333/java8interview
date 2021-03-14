package learningcorejava;

public class LearnArrayMultiDim {

	public static void main(String[] args) {
		
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		
		/*for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]);
			}
			
			System.out.println();
		}*/
		
		// we can use enhanced for loop
		
		for(int k[]:arr) {
			
			for(int l:k) {
				
				System.out.print(l);
			}
			
			System.out.println();
		}

	}

}
