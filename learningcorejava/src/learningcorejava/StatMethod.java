package learningcorejava;

public class StatMethod {
	
	int rollnumber;
	String name;
	static String college="ITS";
	
	
	static void  change() {
		
		college="IIT";
	}
	
	StatMethod(int roll,String na){
		
		rollnumber=roll;
		name=na;
		
	}
	
	void display() {
		
		System.out.println("College "+college+" RollNumber is "+rollnumber+" and Name is "+name);
	}
	
	public static void main(String args[]) {
		
		StatMethod.change();
		StatMethod sm=new StatMethod(11,"Vivek");
		sm.display();
		
	}

}
