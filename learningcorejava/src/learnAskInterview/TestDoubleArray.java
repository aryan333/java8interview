package learnAskInterview;

public class TestDoubleArray {
	
	public static void main(String[] args) {
		
		int i=0;
		int k=0;
		int j=0;
		
		int[][] name=new int[4][5];
		
		for(i=0;i<4;i++) {
			
			for(j=0;j<5;j++) {
				
				name[i][j]=k;
				k++;
			}
		}
		
		for(i=0;i<4;i++) {
					
					for(j=0;j<5;j++) {
						
						System.out.print(name[i][j]);
					}
					System.out.println("");
				}
		    
		
		
		
		
	}

}
