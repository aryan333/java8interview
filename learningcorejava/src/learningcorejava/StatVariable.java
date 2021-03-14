package learningcorejava;

public class StatVariable {
	
	static int count=0;
	
	public StatVariable() {
		// TODO Auto-generated constructor stub
		
		count++;
		
		System.out.println(count);
	}
	
	public static void main(String args[]) {
		
		StatVariable sc=new StatVariable();
		StatVariable sc1=new StatVariable();
	}

}
