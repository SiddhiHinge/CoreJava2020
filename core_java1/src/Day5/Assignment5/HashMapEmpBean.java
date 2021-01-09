package Day5.Assignment5;
import java.util.*;

import Day3.classAttributes.Employee;
public class HashMapEmpBean {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		
		HashMap<String,Employee> employeeMap = new HashMap<String,Employee>();
		String ans = "Y";

		while (ans.equalsIgnoreCase("Y")) {
			System.out.println("Enter Employee Name and Employee Id : ");
			Employee e = new Employee(s1.nextLine(),s2.nextInt());
			System.out.println("Enter Employee Post : ");
			employeeMap.put(s1.nextLine(), e);
			System.out.println("Do you want to add (Y/N) : ");
			ans = s3.next();
		}
		
		Set<String> keysSet = employeeMap.keySet();
		Iterator<String> itr = keysSet.iterator();
		String key;
		System.out.println("Displaying using iterator !");
		while(itr.hasNext()) {
			key = itr.next();
			System.out.println("Post : "+key+" , "+employeeMap.get(key));
		}
		System.out.println("\nDisplaying using for each !");
		for(String k : keysSet) {
			System.out.println("Post : "+ k + " , "+employeeMap.get(k));
		}
	}

}
