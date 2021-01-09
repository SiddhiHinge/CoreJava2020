package Day7.Assignment7;

import java.util.*;

public class Eg1 {

	public static void main(String[] args) {
		
		Set <String> names = new HashSet<String>();
		names.add("Harry Potter");
		names.add("Draco Malfoy");
		names.add("Ron Weasly");
		names.add("Rubeus Hagrid");
		
		List<String> namesList = new LinkedList<String>(names);
		displayList(namesList);
	}
	public static void displayList(List<String> list) {
		for(String x : list) {
			System.out.println(x);
		}
	}

}
