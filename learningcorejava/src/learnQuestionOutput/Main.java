package learnQuestionOutput;


class Complex { 
	private double re, im;	 
	public String toString() { 
		return "(" + re + " + " + im + "i)"; 
	} 
	Complex(Complex c) { 
		re = c.re; 
		im = c.im; 
	} 
} 

public class Main { 
	public static void main(String[] args) { 
		Complex c1 = new Complex(); // humai khud default constuctor bana partaa haii
		Complex c2 = new Complex(c1); 
		System.out.println(c2); 
	} 
} 

/*
 Output: Compiler Error in line “Complex c1 = new Complex();”
In Java, if we write our own copy constructor or parameterized constructor, 
then compiler doesn’t create the default constructor.

means yadi hum parametized contructor bana datai hai too 
compiler humai default constuctor bana kai nahi detaa hai, humai khud default constuctor bana partaa haii
*/