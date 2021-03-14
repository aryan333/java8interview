package learnString;

public class LearnToString {
	
	int a=10;
	int b=20;
	
	
	/*@Override

	Returns a string representation of the object. In general, the toString method returns a 
	string that "textually represents" this object. The result should be a concise but informative 
	representation that is easy for a person to read. It is recommended that all subclasses override this method. 
    The toString method for class Object returns a string consisting of the name of the class 
	of which the object is an instance, the at-sign character `@', and the unsigned hexadecimal 
	representation of the hash code of the object. In other words, this method returns a string equal to the value of: 
    getClass().getName() + '@' + Integer.toHexString(hashCode())
	Overrides: toString() in Object
	Returns:
	a string representation of the object*/
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return a+" "+b;
	}



	public static void main(String[] args) {
		
		LearnToString lst=new LearnToString();
		
		System.out.println(lst);
		
		
	}

}
