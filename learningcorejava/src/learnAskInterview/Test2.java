package learnAskInterview;

class Test3{
	
	int n;
	
	Test3(int i){
	
		n=i;
	}
	
	int num(int n) {
		
		if(n==1)
			return 1;
		int result=num(n-1)*n;
		
		return result;
	}
}

public class Test2 {

	public static void main(String[] args) {
		
		Test3 t3=new Test3(3);
		System.out.println(t3.num(3));

	}

}
