package learnCollectionMap;

import java.util.HashMap;
import java.util.Map;

public class LearmMap1 {
	
	public static void main(String[] args) {
		
		Map<String,String> m1=new HashMap<>();
		
		m1.put("Noida", "201301");
		m1.put("Saharsa", "852129");
		m1.computeIfPresent("Noida", (k,v) -> "5555");
		m1.computeIfAbsent("Patna", k -> "110086");
		
		
		
		// iterate map
		for(String s:m1.keySet()) {
			
			System.out.println(s+" "+m1.get(s));
		}
		
		
		
		
	}

}
