package learningcorejava;


class Papa{
	
	static void speak() {
		
		System.out.println("Speaking Hindi");
	}
}

class Beta extends Papa{
	
	static void speak() {
		System.out.println("Speaking English");
	}
}


public class LearnStatic1 {
	
	public static void main(String[] args) {
	Papa b=new Beta();
	
	b.speak();
	}
	

}
