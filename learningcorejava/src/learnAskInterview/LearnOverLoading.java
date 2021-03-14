package learnAskInterview;

class TestOverload{
	
	public int sum(int a,int b) {
		
		int su=a+b;
		
		return su;
	}
	
	protected int sum(int a,int b,int c) {
			
			int su=a+b+c;
			
			return su;
		}
}

public class LearnOverLoading {
	
	
	static public String report(String s) {
		
		return s;
	}
	
	static private String report(String s,String s2) {
			
			return s+" "+s2;
		}
	
	public static void main(String[] args) {
		
		TestOverload t1=new TestOverload();
		
		System.out.println(t1.sum(5, 6));
		System.out.println(t1.sum(5, 6, 11));
		System.out.println(report("Ajay"));
		System.out.println(report("Ajay","puneet"));
		
	}

}
