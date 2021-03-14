package learnAskInterview;

public class LearnPrimeNumber {
	
	
	public static boolean isPrime(int num) {
		
		if(num==1) {
		return false;
		}
		
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				
				return false;
			}
		}
		
		return true;
	
	}
	
	public static void main(String[] args) {
		
		Boolean b=isPrime(5);
		
		if(b) {
			
			System.out.println(b+"Number is Prime");
			
		}
		
		else {
			
			System.out.println(b+"Number is not Prime");
		}
		
		
	}

}
