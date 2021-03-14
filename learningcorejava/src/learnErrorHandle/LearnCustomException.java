package learnErrorHandle;

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String s) {
		
		super(s);
	}
}

class InvalidString extends Exception{
	
	public InvalidString(String s) {
		super(s);
	}
}

public class LearnCustomException {
	
	static void validateAge(int age) throws InvalidAgeException{
		
		if(age<18) {
			
			throw new InvalidAgeException("Not valid");
		}
		else {
			
			System.out.println("welcome to vote");
		}
	}
	
	static void validateString(String str) throws InvalidString {
		if(str.contains("<")) {
			throw new InvalidString("not valid string");
			
		}else {
			System.out.println("valid string");
		}
	}
	
	public static void main(String[] args) throws InvalidString {
		
		try {
			validateAge(14);
		} catch (InvalidAgeException e) {
			
			System.out.println("Exception occured "+e);
		}
		
		validateString("hh<");
	}
	 

}
