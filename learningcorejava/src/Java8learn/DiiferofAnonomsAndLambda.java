package Java8learn;

/*
 * Difference of lambda expression and anonymous interface 
 */

interface NA{
	void m2();
}
interface NB{
	void l2();
}

public class DiiferofAnonomsAndLambda {
	
	public static void main(String[] args) {
	
	/*
	 * in anonymous interface implementation .code class file is 
	 * generated and state is also maintain.
	 * https://www.geeksforgeeks.org/difference-between-anonymous-inner-class-and-lambda-expression/ 
	 * The major benefit of java 8 functional interfaces is that we can use lambda expressions to 
	 * instantiate them and avoid using bulky anonymous class implementation.
	 */
	NA a=new NA() {	
		public void m2() {
			System.out.println("it is implementation of anonymous interface");
		}
	};
	
	/*
	 * in lambda expression .code class file is not
	 * generated and state is also not maintain. 
	 */
	NB b=()->{
		System.out.println("it is for lambda expression");
	};
	
	a.m2();
	b.l2();
}	

}
