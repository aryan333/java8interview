package learningcorejava;

public class LreanVarArgument {
	
	public int addition(int ... n) {
		
		int sum=0;
		
		for(int i:n) {
			
			sum=sum+i;
			
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		
		
		LreanVarArgument vg=new LreanVarArgument();
		
		System.out.println(vg.addition(5, 4,5,9,2));

	}

}
