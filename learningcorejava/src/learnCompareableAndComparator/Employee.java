package learnCompareableAndComparator;

public class Employee implements Comparable<Employee> {
	
	int id;
	String name;
	int age;
	int salary;
	
	
	
	public Employee(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public int compareTo(Employee e1) {
		
		// mainly working with 0 , 1 , -1
		
		if(age==e1.age)
		return 0;
		else if(age >e1.age)
		return 1;
		else
		return -1;
	}
	
	

}
