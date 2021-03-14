package learnString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import learnCollection.Teacher;

public class LearnCharFreq {
	
	public static void main(String[] args) {
		
		System.out.println("Enter String");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
	    
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
		    char c = s.charAt(i);
		    Integer val = map.get(c);
		    if (val != null) {
		        map.put(c, val + 1);
		    }
		    else {
		       map.put(c, 1);
		   }
		}
		
		
          /* for(Entry<Character, Integer> e:map.entrySet()) {
			
        	   Character t=e.getKey();
        	   Integer s1=e.getValue();
			System.out.println("Char is "+t+" frequency is "+s1);
		
           }*/
		
		for(Character ck:map.keySet()) {
			
			Integer val=map.get(ck);
			
			System.out.println("cha is "+ck+ "  frequency is "+val);
			
		}
           
           
			
		}

}
