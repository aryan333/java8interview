package Java8learn;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnMethodReferenceDetails {
	
	public static void main(String[] args) {
		
		System.out.println("Reference to a Static Method");
		List<Integer>  list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		/*
		 *  work on https://dzone.com/articles/methodreference
		 *  work on https://javarevisited.blogspot.com/2017/03/what-is-method-references-in-java-8-example.html
		 * Reference to a Static Method
		 */
		System.out.println("Normal way");
		// normal way 
		for(int number:list) {
			LearnMethodReferenceDetails.print(number);
		}
		System.out.println("Through lambda");
		// through lambda
		list.forEach(number->LearnMethodReferenceDetails.print(number));
		System.out.println("Through method reference");
		// through method reference
		list.forEach(LearnMethodReferenceDetails::print);
		
		/*
		 * Reference to an Instance Method of a Particular Object
		 */
		System.out.println("Reference to an Instance Method of a Particular Object");
		List<Integer>  listunsort=Arrays.asList(1,2,3,4,5,6,7,10,9,8);
		final MyComparator myComparator = new MyComparator();
		
		System.out.println("Through lambda");
		// through lambda
		Collections.sort(listunsort,(a,b)->myComparator.compare(a, b));
		
		System.out.println("Through method reference");
		// through method reference
		Collections.sort(listunsort,myComparator::compare);	
		
        /*
         * Reference to an Instance Method of an Arbitrary Object of a Particular Type
         */
		System.out.println("Reference to an Instance Method of an Arbitrary Object of a Particular Type");
		 final List<Person> people = Arrays.asList(new Person("dan"), new Person("laura"));
		 
		 System.out.println("Normal way");
		 //normal way 
		 for(Person person:people) {
			 person.printName();
		 }
		 System.out.println("Through lambda");
		 // through lambda
		 people.forEach(name->name.printName());
		 System.out.println("Through method reference");
		 // through method reference
		 people.forEach(Person::printName);
		
	}
	
	public static void print(final int number) {
        System.out.println("I am printing: " + number);
    }
	
	 private static class MyComparator {
	        public int compare(final Integer a, final Integer b) {
	            return a.compareTo(b);
	        }
	 }
	 
	 private static class Person {
	        private String name;
	        
	        public Person(final String name) {
	            this.name = name;
	        }
	        public void printName() {
	            System.out.println(name);
	        }
	    }

}
