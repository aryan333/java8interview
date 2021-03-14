package learnAskInterview;

class Test{
	
	int a;
	
	Test(int i){
		a=i;
	}
	
	Test getTenInc() {
		
		Test test=new Test(a+10);
		return test;
	}
}

public class Test1 {
	
	public static void main(String[] args) {
		
		Test obj1=new Test(2);
		Test obj2;
		obj2=obj1.getTenInc();
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj2=obj2.getTenInc();
		
		System.out.println(obj2.a);
		System.out.println(obj1.a);
		
	}

}
