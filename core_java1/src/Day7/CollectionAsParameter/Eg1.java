package Day7.CollectionAsParameter;

import java.util.*;

public class Eg1 {

	public static void main(String[] args) {

		Set <String> cars = new HashSet <String>();
		cars.add("Hundai");
		cars.add("BMW");
		cars.add("TATA");
		cars.add("Mustang");
		
		List<String> listOfCars = new ArrayList<String>(cars);
		display(listOfCars);
	}
	
	public static void display(List<String> l) {
		for(String x: l) {
			System.out.println(x);
		}
	}

}
