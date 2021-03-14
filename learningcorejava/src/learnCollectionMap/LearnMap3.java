package learnCollectionMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LearnMap3 extends Thread{

	
	static Map<Integer,String>  m1=new ConcurrentHashMap();
	
	public void run() {
		
		m1.put(4, "Gupta");
		
		try {
			
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		m1.put(1, "Ram");
		m1.put(2, "shyam");
		
		LearnMap3 map2=new LearnMap3();
		
		
		// concurrent modification error not occurs
		map2.start();
		
		for(Object o:m1.entrySet()) {
			
			Object s=o;
			
			Thread.sleep(1000);
			
			System.out.println(s);
		}
		
		System.out.println(m1);
		
		
	}
}
