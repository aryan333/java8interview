package learnCollection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class LearnEqual {

	public static void main(String[] args) {
		
		Teacher t1=new Teacher(1);
		Teacher t2=new Teacher(1);
		Map<Teacher,String >  map1=new HashMap<Teacher,String>();
		
		System.out.println(t1);
		System.out.println(t2);
		
		map1.put(t1, "Jack");
		map1.put(t2, "Rack");
		
		
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	
		for(Entry<Teacher,String> e:map1.entrySet()) {
			
			Teacher t=e.getKey();
			String s=e.getValue();
			System.out.println("Key is "+t.id+" Value is "+s);
		
		
	}
		
	Map<String, String>	maps=new HashMap<>();
	Map<String, String>	maps3=new HashMap<>();
	
	maps.put("data", "Raja");
	maps.put("cata", "Raja");
	maps3.put("data", "Raja");
	System.out.println(maps.equals(maps3));
	System.out.println(maps.hashCode());
	System.out.println(maps);
	
}
}

