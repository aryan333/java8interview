package Java8PraticeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PracticePerdicate {
	
	public static void main(String args[]) {
		
		List<EmployeeDTO> employeelist=new ArrayList();
		
		EmployeeDTO employee=new EmployeeDTO();
		employee.setUserId(1);
		employee.setUserName("Deepak");
		employee.setCountryName("India");
		employee.setOrgId(1);
		employeelist.add(employee);
		
		EmployeeDTO employee1=new EmployeeDTO();
		employee1.setUserId(2);
		employee1.setUserName("Neeraj");
		employee1.setCountryName("US");
		employee1.setOrgId(2);
		employeelist.add(employee1);
		
		EmployeeDTO employee2=new EmployeeDTO();
		employee2.setUserId(3);
		employee2.setUserName("Ajay");
		employee2.setCountryName("UK");
		employee2.setOrgId(1);
		employeelist.add(employee2);
		
		for(EmployeeDTO emp:employeelist) {
			System.out.println(emp);
		}
		
		Predicate<EmployeeDTO> namefilter=e->e.getUserName()=="Deepak";
		List<EmployeeDTO> filteremp= employeelist.stream().filter(namefilter).collect(Collectors.toList());
		
		for(EmployeeDTO emp:filteremp) {
			System.out.println(emp);
		}
		
		filteremp.stream().forEach(e->System.out.println(e));
	}
	

}
