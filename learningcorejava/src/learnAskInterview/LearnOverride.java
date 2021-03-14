package learnAskInterview;

class Animal {
	
	public Object bark(String s) {
		
            
            return "voice differnt";
	}
	
}

class Dog extends Animal{
	
	
	// yadi return type  patrent class object type rakh detai hai to tab yadi hum us method ko override
	//kartai hai to uska return type change kar saktai hai jsai humnai yaha pai Interger kiya hai
	// object type return mai aap kuch bhi return kar saktai hai
	
	public Integer bark(String s) {
		
		return 5;
	}
}

public class LearnOverride {
	
	public static void main(String[] args) {
		
		Animal a1=new Dog();
		System.out.println(a1.bark("bh"));
		
	}

}
