package learningcorejava;

abstract class Team22{
	
	abstract void show() ;
}

public class LearnInnerAnonomus {
	

	public static void main(String[] args) {
		
		Team22 t=new Team22() {
			
			void show() {
				
				System.out.println("In anonomus ");
			}
		};
		t.show();

	}

}
