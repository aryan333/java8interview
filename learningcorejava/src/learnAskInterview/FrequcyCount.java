package learnAskInterview;

import java.util.HashMap;
import java.util.Set;

public class FrequcyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="1,1,2,1,3,2";
		HashMap<Integer, Integer> frequency=new HashMap<Integer, Integer>();
		
		for(int i=0;i<input.length();i++) {
			char c=input.charAt(i);
			int k=(int)c - 48;
			if(k>=0 && k<=9) {
				if(frequency.containsKey(k)) {
					int freq=frequency.get(k);
					freq++;
					frequency.put(k, freq);
				}else {
					frequency.put(k, 1);
				}
			}
		}
		
		Set<Integer> keys=frequency.keySet();
		for(int key:keys) {
			System.out.println(key+":"+frequency.get(key));
		}

	}

}
