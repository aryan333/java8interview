package learnArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequecyCountAndSort {
	
	public static void main(String args[]) {
		
		int[]  numarray= {1,2,1,3,1,3,3,4,2,5,7,6,7,1,7,3,3};
		Map<Integer,Integer> key=new HashMap();
		
		for(int i=0;i<numarray.length;i++) {
			int num=numarray[i];
			if(key.containsKey(num)) {
				int freq=key.get(num);
				key.put(num,++freq );
			}else {
				key.put(num, 1);
			}
		}
		List<LearnFreqSort> datasortlist=new ArrayList();
		for(int value:key.keySet()) {
			LearnFreqSort data=new LearnFreqSort();
			System.out.println(value+" fre is  --"+key.get(value));
			data.setKey(value);
			data.setValue(key.get(value));
			datasortlist.add(data);
		}
		Collections.sort(datasortlist, new LearnFreqSort());
		for(LearnFreqSort freqcount:datasortlist) {
			System.out.println(freqcount.getKey()+" fre count is --"+freqcount.getValue());
		}
		
	}

}
