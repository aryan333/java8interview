package learnAskInterview;
import java.util.HashSet;
import java.util.Set;


class CheckTest1{
	String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}

class CheckTest2{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckTest2 other = (CheckTest2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class CheckHashCodeAndEqual {

	public static <K> void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckTest1 n1=new CheckTest1();
		CheckTest1 n2=new CheckTest1();
		
		n1.setName("Ram");
		n2.setName("Ram");
		
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
		
		// without override the equal method Shallow comparison
		System.out.println(n1.equals(n2));
		
		//
		
		// without override the equal method and hashcode set is not working properly 
		Set<CheckTest1> s1=new HashSet<CheckTest1>();
		s1.add(n1);
		s1.add(n2);
		
		for(CheckTest1 set1:s1) {
		System.out.println(set1.name);
		}
		
		CheckTest2 t1=new CheckTest2();
		CheckTest2 t2=new CheckTest2();
		
		t1.setName("Ram");
		t2.setName("Ram");
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		// without override the equal method Deep Comparison
		System.out.println(t1.equals(t2));
		
		Set<CheckTest2> s2=new HashSet<CheckTest2>();
		s2.add(t1);
		s2.add(t2);
		
		for(CheckTest2 set2:s2) {
		System.out.println(set2.name);
		}

	}

}
