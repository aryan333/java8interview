package learnLogicPatternPinku;

public class LearnPattern8 {
	
	public static void main(String[] args) {
		
		/*
		 
		    * * * * * * * * *
			  * * * * * * *
			    * * * * *
			      * * *
			        *

		 
		 */
		
		int j;
		for(int i=1;i<=5;i++) {
			
			for( j=1;j<i;j++) {
				
				System.out.print(" ");
			}
			
			for(int k=i;k<=5;k++) {
				
				System.out.print("*");
			}
			
			for(int l=j;l<=4;l++) {
				
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}
