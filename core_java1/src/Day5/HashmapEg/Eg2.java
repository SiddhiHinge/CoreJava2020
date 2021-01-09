package Day5.HashmapEg;

import java.util.*;

public class Eg2 {

	// Map is an interface which is implemented by HashMap
	static Scanner s1 = new Scanner(System.in);

	public static void main(String[] args) {

		Map<String, String> countryCapital = new HashMap<String, String>();
		String ans = "Y";

		while (ans.equalsIgnoreCase("Y")) {
			System.out.println("Enter Country and its Capital : ");
			countryCapital.put(s1.next(), s1.next());
			System.out.println("Do you want to add (Y/N) : ");
			ans = s1.next();
		}

		Set<String> countries = countryCapital.keySet();
		System.out.println("Printing Hashmap using Keys Set and for each Loop");
		for (String c : countries) {
			System.out.println("Country - " + c + " , Capital - " + countryCapital.get(c));
		}
		
		Iterator<String> itr = countries.iterator();
		String key;
		System.out.println("Printing Hashmap using Iterator & while loop");
		while(itr.hasNext()) {
			key = itr.next();
			System.out.println(key+" , "+countryCapital.get(key));
		}
	}

}
