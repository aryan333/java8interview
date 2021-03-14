package learningcorejava;

class Dogi{
	
	void bark() {
		
		System.out.println("Dog is barking");
	}
	
	static void grom() {
		
		System.out.println("Groomin");
	}
	
	
	
	// inner static class, outer class never be static
	
	static class Bhima{
		
		static void dance() {
			
			System.out.println("Bhim Dancing");
		}
	}
	
}

class LabraDog extends Dogi{
	
	
	static void grom() {
		
		System.out.println("bbbbbbb");
	}
	
	void eat() {
		
		System.out.println("Non veg");
	}
}

public class LearnInher1 {

	public static void main(String[] args) {
		
		LabraDog ld=new LabraDog();
		
		ld.bark();
		ld.eat();
		ld.grom();
		Dogi.Bhima.dance();
		
		

	}

}
