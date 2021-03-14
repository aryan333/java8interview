package learnDesignPattern;

class Singleton{
	
	private static Singleton instance=new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		return instance;
	}
}

public class EagerSingleton {
	
	public static void main(String[] args) {
		
		 Singleton sg= Singleton.getInstance();
		 Singleton sg1= Singleton.getInstance();
		 System.out.println(sg);
		 System.out.println(sg1);
		
	}

}
