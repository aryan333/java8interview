package learnAskInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequecyWordCount {
	
	public static void  main(String args[]) {
		
		String str="This is is this my data my";
		
		Map<String,Integer> fre=new HashMap<String,Integer>();
		String ntr="";
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			
			if(c>64 && c<122) {
				ntr=ntr+c;
			}else {
			  if(fre.containsKey(ntr)) {
				  int freq=fre.get(ntr);
				  freq++;
				  fre.put(ntr, freq);
			  }else {
				  fre.put(ntr, 1);
			  }
			  ntr="";
			}
		}
		
		if(fre.containsKey(ntr)) {
			  int freq=fre.get(ntr);
			  freq++;
			  fre.put(ntr, freq);
		  }else {
			  fre.put(ntr, 1);
		  }
		
		Set<String> str1=fre.keySet();
		for(String key:str1) {
			System.out.println(key+":"+fre.get(key));
		}
		
	}

}
