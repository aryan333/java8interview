package learnLogicPatternPinku;

public class LearnPattern3 {

	public static void main(String[] args) {
		
		/*
		 
		    A
			B B
			C C C
			D D D D
			E E E E E
		 */
		
		
		 for(Character c='A';c<='E';c++) {
				
				for(Character j='A';j<=c;j++) {
					
					System.out.print(c);
				}
				
				
				System.out.println("");
			}

	}

}
