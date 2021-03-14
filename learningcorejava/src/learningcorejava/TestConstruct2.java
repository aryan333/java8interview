package learningcorejava;

public class TestConstruct2 {
	
	int salary;
	String name;
	
	public TestConstruct2(int salary,String name) {
		
		this.salary=salary;
		this.name=name;
		
	}
	
	void display() {
		
		System.out.println("Name is "+name+" and salary is "+salary);
	}
	
	public static void main(String args[]) {
		
		TestConstruct2 ts=new TestConstruct2(10000,"Nitesh");
		ts.display();
	}

}
