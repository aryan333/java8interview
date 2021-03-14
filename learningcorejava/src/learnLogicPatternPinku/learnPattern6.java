package learnLogicPatternPinku;

public class learnPattern6 {

	public static void main(String[] args) {
		
		/*
		 
		                            *
							      * * *
							    * * * * *
							  * * * * * * *
							* * * * * * * * *

		 
		 */
		
		int j,i,k,l;
		
		for( i=5;i>0;i--) {
			
			for( j=1;j<i;j++) {
				
				System.out.print(" ");
				
			}
			
			
			for(k=5;k>=i;k--) {
				
				System.out.print("*");
			}
			
			for(l=j;l<5;l++) {
				
				System.out.print("*");
			}
			
			System.out.println("");
		}

	}

}
