package learningcorejava;

class Animal {
	
	String color="Green";
}

class Dog extends Animal {
	
	String color="White";
	
	void color() {
		
		System.out.println("Dog color is "+color); // print the color or Dog class
		System.out.println("Animal color is "+super.color); // super is use to parent class instance variable
	}
}

public class LearnSuper {
	
	public static void main(String[] args) {
		
		Animal d=new Dog();
		
		System.out.println(d.color);
	}

}
