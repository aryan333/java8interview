package learnLogicPatternPinku;

public class LearnPattern7 {
	
	public static void main(String[] args) {
		
		/*
		   
		    1
	      2 3 2
	    3 4 5 4 3
	  4 5 6 7 6 5 4
	5 6 7 8 9 8 7 6 5

		   
		 */
		
		int i,j,k,l;
		int m=0;
		
		for( i=5;i>0;i--) {
			
			for(j=1;j<i;j++) {
				
				System.out.print(" ");
			}
			
			for(k=i;k<=5;k++) {
				
				System.out.print(++m);
			}
			
			for(l=j;l<=4;l++) {
				
				System.out.print(--m);
			}
			
			System.out.println("");
		}
	}

}
