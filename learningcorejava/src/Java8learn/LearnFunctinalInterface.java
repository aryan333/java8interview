package Java8learn;

/*
 * functional interface has only one abstract method but they have multiple 
 * number of default method and static method.
 * A lambda expression is an instance of A functional interface.
 */

@FunctionalInterface
interface A{
	void runtest();
}
@FunctionalInterface
interface B{
	int add(int a,int b);
}
@FunctionalInterface
interface C{
	int sub(int a,int b);
}
@FunctionalInterface
interface D{
	boolean testeven(int n);
}
@FunctionalInterface
interface E{
	String testString(String str);
}

public class LearnFunctinalInterface {
	public static void main(String[] args) {
	/*
	 * Lambda is implementation of functional interface so
	 * A lambda expression is an instance of A functional interface ..
	 * Lambda expression is dependent on the signature of functionalInterface abstract method.
	 * The major benefit of java 8 functional interfaces is that we can use lambda expressions 
	 * to instantiate them and avoid using bulky anonymous class implementation.
	 * 
	 * https://javaconceptoftheday.com/java-8-functional-interfaces/
	 */
	A a=()->{
	System.out.println("Hello");
	};
	a.runtest();
	
	// it is block lambda statement
	B b=(int n1,int n2)->{ 
		int c= n1+n2;
		return c;
	};
	System.out.println(b.add(30, 40));
	
	C c=(n1,n2)->n1-n2;
	System.out.println(c.sub(30, 10));
	
	D d=(e)->e%2==0;
	System.out.println(d.testeven(10));
	
	E reverse=(str1)->{
		String revString="";
		for(int i=str1.length()-1;i>=0;i--) {
			revString=revString+str1.charAt(i);
		}
		return revString;
	};
	
	System.out.println(reverse.testString("Hello"));
			
	
  }
}	
