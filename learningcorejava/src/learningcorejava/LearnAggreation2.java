package learningcorejava;

public class LearnAggreation2 {
	
	int id;
	String name;
	LearnAggreagation1 address;
	
	public LearnAggreation2(int id,String name,LearnAggreagation1 address) {
		
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	
	void display() {
		
		System.out.println(id+"Name is "+name+"city is "+address.city+"State is "+address.state);
		
	}
	
	public static void main(String args[]) {
		
		LearnAggreagation1 address=new LearnAggreagation1("Noida", "Up", "India");
		LearnAggreation2 emp=new LearnAggreation2(1, "Suraj",address);
		emp.display();
		
	}

}
