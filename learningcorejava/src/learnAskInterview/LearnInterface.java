package learnAskInterview;

// learning if we dont implements all method of interface we just make a  abstract class and implements some
// methods and other sub class extends abstract class and ovveride the unimplemented methods

interface Whiler{
	
	public void tyer();
	
	public void seat();
	
	public void speed();
	
}


public abstract class LearnInterface implements Whiler {
	
	@Override
	public void tyer() {
		
		System.out.println("Tyer ===========");
		
	}
	
	public static void main(String[] args) {
		
		A1 a1=new A1();
		a1.seat();
		a1.tyer();
		
	}

	

}

class A1 extends LearnInterface{

	

	@Override
	public void seat() {
		
		System.out.println("Seat ===========");	
		
	}

	@Override
	public void speed() {
		
		System.out.println("Seat ===========");
		
	}

	

	

	
	
}
