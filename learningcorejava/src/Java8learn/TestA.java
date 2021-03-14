package Java8learn;


interface Company {
	
/*	Default methods : 
 * 
	To overcome the problem rewriting of the existing interface.
	(means when we add a method in the interface so we need change in all implementation classes).
    To avoid writing utility class .
    it is default public access modifiers.  
  */  
	default void bike() {
		System.out.println("default method testinggg");
	}
	public void car();
}
class NewTest implements Company{
	@Override
	public void car() {
		System.out.println("override car");
	}	
}

class AgainTest implements Company{
	@Override
	public void car() {
		System.out.println("override car");
	}
	@Override
	public void bike() {
		System.out.println("override bike in AgainTest");
	}
}

public class TestA{
	
	public static void main(String[] args) {
		
		NewTest test=new NewTest();
		test.bike();
		test.car();
		
		AgainTest atest=new AgainTest();
		atest.bike();
		atest.car();
		
		NewBasic ntest=new NewBasic();
		ntest.basicphone();
		
	}
}	
// multiple inheritance problems 		
interface SamsungMobile{
	
	default void basicphone() {
		System.out.println("samsung basisc phone");
	}
}
interface LgMobile{
	
	default void basicphone() {
		System.out.println("lg basisc phone");
	}
}

// it is produce amibigutiy problem so we override the defaults methods
class NewBasic implements SamsungMobile,LgMobile{

	@Override
	public void basicphone() {
		LgMobile.super.basicphone();
		SamsungMobile.super.basicphone();
	}
}
