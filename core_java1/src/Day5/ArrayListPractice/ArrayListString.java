package Day5.ArrayListPractice;

import java.util.*;

public class ArrayListString {

	static Scanner s1 = new Scanner(System.in);
	static Scanner s2 = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<String> allCourses = new ArrayList<String>();

		String ans = "Y";
		int i = 0;

		while (ans.equalsIgnoreCase("Y")) {

			System.out.println("Enter course name " + (i + 1) + " :");
			allCourses.add(s1.next());
			System.out.println("Do you want to enter ? (Y/N) : ");
			ans = s2.next();
			i++;
		}

		Iterator<String> itr = allCourses.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
