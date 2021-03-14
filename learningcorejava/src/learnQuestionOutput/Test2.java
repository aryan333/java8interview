package learnQuestionOutput;


// Learning part is yadi hum kisi ka class object bana tai hai to phlai uska local variable intialize hota hai

class Test1{
	
	Test1(int x){
		
		System.out.println("contructor is"+x);
	}
}

class Test{
	
	Test1 t1=new Test1(10); // new concept 
	
	Test(int i){
		
		t1=new Test1(i);
	}
	
}

public class Test2 {
	
	public static void main(String[] args) {
		
		Test t2=new Test(5);
	}

}

/*The output of the program is Constructor called 10 Constructor called 5.
First t2 object is instantiated in the main method. As the order of initialization of local 
variables comes first than the constructor,first the instance variable (t1), in the class Test2 
is allocated to the memory. In this line a new Test1 object is created, constructor is called in class 
Test1 and ‘Constructor called 10’ is printed. Next the constructor of Test2 is called and again a
new object of the class Test1 is created and ‘Constructor called 5’ is printed.*/
