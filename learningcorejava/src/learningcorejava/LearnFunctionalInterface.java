package learningcorejava;

// Functional Interface

@FunctionalInterface

interface Demo1{
	
	 void show();
	
}

public class LearnFunctionalInterface  {

	public static void main(String[] args) {
		
		
		// Through lamda expression
		
		Demo1 d1=()-> System.out.println("Functional Interface");
		
		d1.show();

	}

}
