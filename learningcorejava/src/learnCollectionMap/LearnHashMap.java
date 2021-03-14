package learnCollectionMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnHashMap {

	public static void main(String[] args) {
		
		Map<Integer,String> map1=new HashMap<>();
		
		map1.put(null,"Vijay");
		//map1.put(null, "rahul");
		
		
		for(Entry<Integer,String> e:map1.entrySet()) {
			
			System.out.println(e.getKey()+" "+e.getValue());
			
		}

	}

}
