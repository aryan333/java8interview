package learnString;

public class LearnStringCharFreq {
	
	public static void main(String[] args) {
		
		String name="puneetu";
		int count=1;
		
		String store="";
		String store1="";
		
		for(int i=0;i<name.length();i++) {
			
			store1=store1+name.charAt(i);
			if(store.contains(store1)) {
				
				return;
			}
			
			store=store+name.charAt(i);
			
			
			for(int k=i+1;k<name.length();k++) {
				
				if(name.charAt(i) == name.charAt(k) ) {
					
					count++;
					
				}
			}
			
			Character cr=name.charAt(i);
			System.out.println(cr+" freq "+count);
			count=1;
			store1="";
		}
	}

}
