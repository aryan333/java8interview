package learningcorejava;

public class UseOfThis1 {
	
	public UseOfThis1() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Come In");
	}
	
	public UseOfThis1(int a) {
		
		this();
		
		System.out.println(a);
		
		
		
	}
	
	public UseOfThis1(String na) {
		
		System.out.println(na);
		
	}
	
	public static void main(String args[]) {
		
		UseOfThis1 us=new UseOfThis1(20);
	}

}
