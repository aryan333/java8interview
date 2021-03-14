package learnAskInterview;


class Traingle{
	
	int height;
	int weight;
	int length;
	
	Traingle(int h,int w,int l){
		
		height=h;
		weight=w;
		length=l;
		
	}
}
public class StringConc {
	
	public static void main(String[] args) {
	
	Traingle t=new Traingle(10, 12, 5);
	
	
	String str="BP :"+t;
	
	System.out.println(t);
	System.out.println(str);
	
	}
	
	

}
