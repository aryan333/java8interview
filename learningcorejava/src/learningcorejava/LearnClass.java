package learningcorejava;

public class LearnClass {
	
	int a=10;
	int b=5;
	int result;
	
	
	
	static int sub() {
		
		LearnClass l=new LearnClass();
		
		l.result=l.a-l.b;
		
		return l.result;
	}
	
	
	public static void main(String[] args) {
		
		LearnClass l=new LearnClass();
		
		
		int su=sub();
		
		
		System.out.println(su);
	}

}
