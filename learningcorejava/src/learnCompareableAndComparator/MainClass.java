package learnCompareableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		
		List<Employee> l1=new ArrayList<Employee>();
		l1.add(new Employee(1,"vikas",22,25000));
		l1.add(new Employee(5,"rakas",28,55000));
		l1.add(new Employee(4,"raghav",12,15000));
		l1.add(new Employee(3,"vipul",52,35000));
		
		System.out.println(l1);
		
		// sotring through comparable 
		Collections.sort(l1);
		System.out.println(l1);
		
		// sorting through comprator
		Collections.sort(l1, new SalaryEmployeeComPrator());
		System.out.println(l1);
	}

}
