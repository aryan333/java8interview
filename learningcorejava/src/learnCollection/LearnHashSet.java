package learnCollection;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
	
	public static void main(String[] args) {
		
		Set<String>   set=new HashSet<>();
		
		set.add("Ajay");
		set.add("Ajay");
		set.add("vikas");
		
		for(String s:set) {
			
			System.out.println(s);
		}
	}

}
