package FunctionalInterface;


@FunctionalInterface
interface Find{
	
	boolean find(int n);
}

public class FuncClassExam1{
	
	
	public static void main(String[] args) {
		
		FuncInterfaceExam1 fe=(int n1,int n2)->{
			 
			System.out.println("Come in");
			return n1+n2;
		};
		
		Find even=(n)->n%2==0;
		Find positive=(n)-> n>=0;
		
		int n3=fe.add(10,20);
		boolean b1=even.find(10);
		boolean b2=positive.find(-7);
		System.out.println(n3);
		System.out.println(b1);
		System.out.println(b2);
		
	}

}
