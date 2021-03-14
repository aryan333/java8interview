package learningcorejava;

 class Etc {
	 
	 int salary=70000;
 }

 class Inher2 extends Etc {
	
	int bonus=10000;
	
	public static void main(String args[]) {
		
		
		Inher2 in=new Inher2();
		System.out.println(in.salary);
		System.out.println(in.bonus);
		
	}
}


