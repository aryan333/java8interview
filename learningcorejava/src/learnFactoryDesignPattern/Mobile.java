package learnFactoryDesignPattern;

public class Mobile {
	
	public static void main(String[] args) {
		
		Factory fm=new Factory();
		Computer cm=fm.getInstance("open");
		
		cm.os();
	}

}
