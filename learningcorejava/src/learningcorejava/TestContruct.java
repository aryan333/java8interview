package learningcorejava;

public class TestContruct {
	
	int salary;
	String name;
	
	public TestContruct() {
		
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TestContruct(int sal,String na) {
		
		salary=sal;
		name=na;
		
		
	}
   
	public static void main(String args[]) {
		TestContruct tc=new TestContruct();
		//TestContruct tc=new TestContruct(5000,"Ajay");
		tc.setName("Ajay");
		tc.setSalary(50000);
		System.out.println(tc.getSalary());
		System.out.println(tc.getName());
		
	}
}
