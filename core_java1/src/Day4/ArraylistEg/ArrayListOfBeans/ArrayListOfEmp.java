package Day4.ArraylistEg.ArrayListOfBeans;

import java.util.*;

import Day3.classAttributes.Employee;

public class ArrayListOfEmp {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Harry",1001);
		Employee employee2 = new Employee("Ron",1002);
		Employee employee3 = new Employee("Draco",1003);
		Employee employee4 = new Employee("Nevile",1004);
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		
		Iterator<Employee> itr = employeeList.iterator();
		
		while(itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e);
		}
	}

}
