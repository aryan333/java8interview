package Java8learn;

@FunctionalInterface
interface Goodmr{
	void mdd();
}

class Atest{
	static void msm() {
		System.out.println("static method in Atest");
	}
}

public class LearnMethodReference {
	
	public static void main(String[] args) {
		/*
		 * Need of method reference :
		 * lambda is implementation of functional interface ,
		 * and lambda is calling existing method functionalities.
		 * so it short hand way writing a lambda expression that will
		 * be existing refer a method.
		 * Goodmr mr = ()->Atest.msm();
		 * but through method reference Goodmr mr=Atest::msm;
		 * Types:
		 * static method reference
		 * non static method reference or instance method refernce
		 * constructor method reference
		 */
		
		Goodmr mr=Atest::msm;
		mr.mdd();
	}

}
