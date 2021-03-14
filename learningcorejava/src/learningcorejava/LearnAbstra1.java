package learningcorejava;

abstract class Bike {
	
	 abstract void run() ;
	
}

class Honda extends Bike{
	
	void run() {
		
		System.out.println("Running 120 kmh");
	}
}

public class LearnAbstra1 {
	
	public static void main(String[] args) {
		
		Bike b=new Honda();
		b.run();
	}

}
