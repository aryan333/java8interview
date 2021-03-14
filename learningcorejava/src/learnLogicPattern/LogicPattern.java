package learnLogicPattern;

public class LogicPattern {
	
	
	public static void main(String[] args) {
	
	/* print pattern 
	 *               
	 *               1
	                 12
	                 123
	                 1234
	                 12345*/
		
		
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
			}
			
			    System.out.println();
			
		}
		
		
		/* print pattern 
		 * 12345
		 * 1234
		 * 123
		 * 12
		 * 1
		 * 
		 * */
		
		System.out.println("************");
		
			       for(int i=5;i>=1;i--){
						
						for(int j=1;j<=i;j++) {
							
							System.out.print(j);
						}
						
						    System.out.println();
						
					}
	    System.out.println("************");
	    
	    

		/* print pattern 
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 * 
		 * */
	    
			for(int i=1;i<=5;i++){
						
						for(int j=1;j<=i;j++) {
							
							System.out.print(i);
						}
						
						    System.out.println();
						
					}
			
			 System.out.println("************");
			
			/* print pattern 
			 * 54321
			 * 5432
			 * 543
			 * 54
			 * 5
			 * 
			 * */
			 
			 for(int i=1;i<=5;i++) {
				 
				 for(int j=5;j>=i;j--) {
					 
					 System.out.print(j);
				 }
				 
				 System.out.println("");
			 }
			 
			 System.out.println("************");
				
				/* print pattern 
				 * 5
				 * 54
				 * 543
				 * 5432
				 * 54321
				 * 
				 * */
				 
				 for(int i=5;i>=1;i--) {
					 
					 for(int j=5;j>=i;j--) {
						 
						 System.out.print(j);
					 }
					 
					 System.out.println("");
				 }
	    
				 System.out.println("************");	 
				 
				 /* print pattern 
					 * 1
					 * 121
					 * 12321
					 * 1234321
					 * 123454321
					 * 
					 * */
				 
				 int j;
				 for(int i=1;i<=5;i++) {
					 
					 for(j=1;j<=i;j++) {
						 
						 System.out.print(j);
						 
					 }
					 
					 for(int k=2;k<=i;k++) {
						 
						 System.out.print(j-k);
					 }
					 
					 System.out.println("");
				 }
	
	}

}
