package Day4.ArraylistEg;

import java.util.*;

public class Eg6 {
	//ArrayList of salaries
	public static void main(String[] args) {
		
		ArrayList<Integer> salary = new ArrayList<Integer>();
		salary.add(56);
		salary.add(23);
		salary.add(10);
		salary.add(90);
		Collections.sort(salary);
		System.out.println("Sorting in Ascending order : "+salary);
		Collections.reverse(salary);
		System.out.println("Sorting in Descending order : "+salary);
		
		//Or we can also use Collections.sort(salary, Collections.reverseOrder());
		//for descending order

	}

}
