package learnCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnCollection1 {
	
	public static void main(String[] args) {
	
	List<String> list=new ArrayList<String>();	
	
	// add in list
	
	list.add("Ajay");
	list.add("Ajay");
	list.add("rama");
	list.add("bhanu");
	
	List<String> list1=new ArrayList<>();
	
	list1.add("Suraj");
	
	// merging two list
	
	list.addAll(list1);
	
	// remove with list
	
	list.remove(2);
	
	
	Iterator<String> itr=list.iterator();
	
	while(itr.hasNext()) {
		
		System.out.println(itr.next());
	}
	
	System.out.println("**************");
	
	Student s=new Student();
	Student sn=new Student();
	
	List<Student> student=new ArrayList<>();
	
	s.setName("vivek");
	s.setAge(22);
	
	sn.setName("Bhallu");
	
	student.add(s);
	student.add(sn);
	
	for(Student s1:student) {
		
		System.out.println(s1.getName());
	}
	
	}
	
	

}
