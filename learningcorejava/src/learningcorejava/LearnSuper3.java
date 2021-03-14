package learningcorejava;


class Pandu{
	
	public Pandu() {
		
		System.out.println("Pandu comming");
	}
	
	public Pandu(int n) {
		
		System.out.println("Pandu with variable");
		
	}
}

class Arjun extends Pandu{
	
	public Arjun() {
		
		// yaha pai automatic super() lag jata hai jo parent class kai default constructor ko call karta hai
		System.out.println("Arjun is comming");
	}
	
	public Arjun(int n) {
		
		
		super(n); // yaha pai parent class parmertized constructor call kiyaa
		System.out.println("Arjun with variable");
		
	}
}

public class LearnSuper3 {

	public static void main(String[] args) {
		
		Arjun a=new Arjun(5);
		

	}

}
