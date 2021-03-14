package learningcorejava;


class Bank {
	
	static int getRateOfInterest() {
		
		return 0;
	}
}

class SBI extends Bank{
	
	static int getRateOfInterest() {
		
		return 7;
	}
}

class PNB extends Bank{
	
	static int getRateOfInterest() {
		
		return 8;
	}
}

public class LearnMethodOverride {
	
	public static void main(String args[]) {
	
	SBI sb=new SBI();
	
	PNB pb=new PNB();
	
	System.out.println(sb.getRateOfInterest());
	
	System.out.println(pb.getRateOfInterest());
	
	}
	
	
	
	

}
