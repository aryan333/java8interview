package learningcorejava;


class Animal1{
	
	void behave() {
		
		System.out.println("Animal is running");
	}
	
}

class Dog1 extends Animal1 {
	
	void behave() {
		
		System.out.println("Dog is running very fast");
	}
	
	void work() {
		
		behave();
		
		super.behave();
	}
}

public class LeranSuper1 {
	
	public static void main(String[] args) {
		
		Dog1 d=new Dog1();
		
		d.work();
		
	}

}
