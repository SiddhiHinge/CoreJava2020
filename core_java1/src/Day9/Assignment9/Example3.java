package Day9.Assignment9;

import java.util.*;
import Day3.classAttributes.Employee;

public class Example3 {

	public static void main(String[] args) {

		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		Employee e1 = new Employee("Harry Potter", 90);
		Employee e2 = new Employee("Ron Weasly", 21);
		Employee e3 = new Employee("Draco Malfoy", 87);
		Employee e4 = new Employee("Rubeus Hagrid", 48);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);

		Iterator<Employee> itr = employeeList.iterator();
		while (itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e);
		}

		int n = employeeList.size();
		int[] empNo = new int[n];

		for (int i = 0; i < n; i++) {
			empNo[i] = employeeList.get(i).getEmpNo();
		}

		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (empNo[j - 1] > empNo[j]) {
					// swap elements
					temp = empNo[j - 1];
					empNo[j - 1] = empNo[j];
					empNo[j] = temp;
				}

			}
		}

		System.out.println("\nPrinting the EmployeeList in Asecending order of EmpNo = ");
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {
				Employee e = employeeList.get(y);
				if (empNo[x] == e.getEmpNo()) {
					System.out.println(e);
				}
			}

		}

	}

}

