package learningcorejava;


class God{
	
	static int life() {
		
		//System.out.println("Givving life");
		
		return 1;
	}
}

class Human extends God{
	
	static int life() {
		
		//System.out.println("Human Giving life");
		
		return 0;
	}
}

public class LearnInheri4 {
	
	public static void main(String[] args) {
	
	Human h=new Human();
	
	System.out.println(h.life());
	
	}
	
	

}
