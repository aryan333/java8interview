package Java8learn;


@FunctionalInterface
interface MyDisplay{
	void display(String msg);
}

// user defined class 
class Hello{
	
	Hello(String s){
		System.out.println(s);
	}
}

@FunctionalInterface
interface TestDisplayChar{
	String stringfun(char array[]);
}

public class LearnMethodReferToContuctor1 {
	
	
	/*
	 * static method reference                -> className::MethodName
	 * instance method reference              -> objectName::MethodName
	 * method refer to a constructor of class -> className::new 
	 * 
	 */

	public static void main(String[] args) {
		
		// through user defined class
		MyDisplay myd = Hello::new;
		myd.display("Hello java");
		
		// through predefined class
		TestDisplayChar tchr=String::new;
		char c[]= {'a','b','c'};
		System.out.println(tchr.stringfun(c));
	}

}
