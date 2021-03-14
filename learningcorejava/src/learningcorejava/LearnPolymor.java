package learningcorejava;


class Animal2{
	
	void eat() {
		
		System.out.println("Eating good foods");
	}
}

class Dog2 extends Animal2{
	
	void eat() {
		
		System.out.println("Eating Non veg");
	}
}

public class LearnPolymor {
	
	public static void main(String[] args) {
		
		Animal2 an=new Dog2();
		
		an.eat();
	}

}
