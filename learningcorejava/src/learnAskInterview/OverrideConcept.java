package learnAskInterview;

class Parent{
	
	void fun() {
		System.out.println("Parent Running");
	}
	
	void test(Child p) {
		
		System.out.println("Parent class Running");
	}
}

class Child extends Parent{
	
	@Override
	void fun() {
		System.out.println("child Running");
	}
	
	@Override
    void test(Child p) {
		
		System.out.println("child class Running");
	}
}

public class OverrideConcept  {
	
	
	
	public static void main(String args[]) {
		
		// rember it is gives type mismatch exception ,annot convert from Parent to Child
		//Child or=new Parent();
		
		// If a Parent type reference refers 
        // to a Parent object, then Parent's 
        // fun is called 
		Child ncc=new Child();
		Parent or=new Parent();
		or.fun();
		or.test(ncc);
		
		// If a Parent type reference refers 
        // to a Child object Child's fun() 
        // is called. This is called RUN TIME 
        // POLYMORPHISM.
		Child cc=new Child();
        Parent crf=new Child(); 
		crf.fun();
		crf.test(cc);
		
		
		
	}

}
