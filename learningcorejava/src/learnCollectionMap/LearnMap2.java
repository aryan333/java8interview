package learnCollectionMap;

import java.util.HashMap;
import java.util.Map;


		
		    public class LearnMap2 extends Thread {
			
		    static Map<Integer,String>  m1=new HashMap<>();
			
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
				
				LearnMap2 map2=new LearnMap2();
				
				
				// concurrent modification error occurs
				map2.start();
				
				for(Object o:m1.entrySet()) {
					
					Object s=o;
					
					Thread.sleep(1000);
					
					System.out.println(s);
				}
				
				System.out.println(m1);
				
				
			}
		
		}
