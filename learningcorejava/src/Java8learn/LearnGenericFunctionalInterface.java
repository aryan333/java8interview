package Java8learn;

@FunctionalInterface
interface TestG {
  Object testgen(Object ob);
}

/*
 * A lambda expression can't be generic.
 * but a functional interface can be generic.
 * generic provide type safety
 */
@FunctionalInterface
interface GenricInterace<T>{
	T testgen(T o);
}

public class LearnGenericFunctionalInterface {
	
	public static void main(String[] args) {
		
		/*
		 * Here we need to type casting,
		 * so better to use generic
		 */
		
		TestG tesg=(n1)->{
			System.out.println("In method "+n1);
			int nt=(Integer)n1*20;
			System.out.println("In method "+nt);
			return nt;
		};
		
		tesg.testgen(10);
		
		GenricInterace<Integer> gt=(n)->{
			int fact=1;
			for(int i=n;i>0;i--)
				fact=fact*i;
			return fact;	
		};
		
		System.out.println(gt.testgen(5));
		
		GenricInterace<String> rst=(s)->{
			String reverString = "";
			for(int i=s.length()-1;i>=0;i--)
				reverString=reverString+s.charAt(i);
			return reverString;
		};
		
		System.out.println(rst.testgen("Java"));
	}

}
