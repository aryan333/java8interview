package learnFactoryDesignPattern;

public class Factory {
	
	public Computer getInstance(String str) {
		
		if(str=="open") {
			
			return new Andriod();
		}
		else if(str=="closed")
		{
		
		return new Ios();
	}
		return new Window();
	
	}
}
