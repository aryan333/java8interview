package Java8learn;

class Lowertest{
	
	String lowercase(String s) {
		String lowstring="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>'A'&&ch<'Z') {
				ch=(char) (ch+32);
			}
			lowstring=lowstring+ch;	
		}
		return lowstring;
	}
}

@FunctionalInterface
interface Ahgtr{
	String aarange(String str1);
}

public class LearnNonstaticmethodRefernce {
	
	public static void main(String[] args) {
		Lowertest lc=new Lowertest();
		Ahgtr agr = lc::lowercase;
	    System.out.println(agr.aarange("RahUl"));
	}

}
