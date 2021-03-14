package Java8learn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnStream {
	
	public static void main(String args[]) {
	
	/*
	 * https://shekhargulati.com/7-days-with-java-8/
	 * Stream API is used to process Collection of object.A stream is a sequence of objects 
	 * that supports various methods which can be pipelined to produce the desired result.
	 */
		
		System.out.println("-------------Intermediate Operations--------------------");
		
		System.out.println("-------------map method--------------------");
		
		/*
		 * map : The map method is used to returns a stream consisting of
		 *  the results of applying the given function to the elements of this stream.
		 */
		
		List<Integer> number=Arrays.asList(2,3,4,5);
		List<Integer> square=number.stream().map(e->e*e).collect(Collectors.toList());
		square.forEach(e->System.out.print(" " +e));
		
		System.out.println();
		System.out.println("-------------filter method--------------------");
		
		/*
		 * filter: The filter method is used to select elements as per the Predicate passed as argument.
		 */
		
		// 1st approach
		List<String> name=Arrays.asList("Sort","Collection","Stream");
		List<String> filterName=name.stream().filter(e->e.startsWith("S")).collect(Collectors.toList());
		filterName.forEach(e->System.out.print(" " +e));
		
		System.out.println();
		// 2nd approach
		
		Predicate<String> filternamedata=e->e.startsWith("S");
		List<String> filtername1=name.stream().filter(filternamedata).collect(Collectors.toList());
		filtername1.forEach(e->System.out.print(" "+e));
		
		System.out.println();
		System.out.println("-------------sorted method--------------------");
		
		name.stream().sorted().collect(Collectors.toList()).forEach(e->System.out.print(" "+e));
		
		System.out.println();
		System.out.println("-------------Terminal Operations--------------------");
		
		/*
		 * collect: The collect method is used to return the result of the intermediate operations performed on the stream.
		 * 
		 * forEach: The forEach method is used to iterate through every element of the stream.
		 * 
		 * reduce: The reduce method is used to reduce the elements of a stream to a single value.
		 */
		
		System.out.println();
		System.out.println("-------------reduce method--------------------");
		
		Stream.of(10,20,30,40,50).reduce((x,y)->x+y).ifPresent(System.out::println);
		
		System.out.println();
		System.out.println("-------------Consumer--------------------");
		
		/*
		 * Consumer :  It represents a function which takes in one argument and produces a result.
	    */
		
		Consumer<Integer> display=a->System.out.println(a);
		display.accept(10);
		display.accept(30);
		
		System.out.println();
		System.out.println("-------------Supplier--------------------");
		
		/*
		 * Supplier Interface : It represents a function which does not take in any argument but produces a value of type T.
		 */
	     
		int x=1;int y=3;
		Supplier<Integer> dataadd=()->x+y;
		System.out.println(dataadd.get());
	}
}
