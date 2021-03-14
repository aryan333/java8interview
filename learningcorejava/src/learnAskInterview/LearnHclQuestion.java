package learnAskInterview;

/*
 
 java hamesa call by value kaam karta hai , jab hum method int a ,boolean b 
 pass kartai hai to yai call by value hai mean iska copy ban kai dusrai method kai pass chala jata hai aur 
 yadi wo method kuch a mai change  karai to dusrai method mai uska effect nahi dekhta hai. due to stack all methods and varibles
 and refernce variable stack mai bantaa hai but class to object heap memory mai bantaa hai.
 
  but yadi emp class ka object bana kai uska  refernce hi pass kar dai to yai bhi call by value hi hai but
  yaha pai yadi value is method mai chage hui to dusrai method mai bhi uska effect dekhta hai beacause borh refernces point same
  object ;
  
 
 
 */



class Emp{
	
	 String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	 
	
}

public class LearnHclQuestion {
	
	int a;
	public  void ab() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("testBuilder");
		
		String str="Aaj new Concept";
		
		  a=5;
		
		Emp e1=new Emp();
		
		e1.setName("Durga");
		
		cd(e1,sb,a,str);
		
		
		e1.getName();
		
		System.out.println(e1.getName()+" "+sb+" "+a+" "+str);
	}
	
	public void cd(Emp e1,StringBuilder sb,int a,String str) {
		
		e1.setName("Ajay");  // yaha employee kai object pai kaam ho raha hai
		
		sb.append(" new Add");
		
		this.a=7;
		
		str="Deepak";
		
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		
		LearnHclQuestion l1=new LearnHclQuestion();
		l1.ab();
		
		
		
	}

}
