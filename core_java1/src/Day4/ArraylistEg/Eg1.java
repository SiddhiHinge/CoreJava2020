package Day4.ArraylistEg;

import java.util.ArrayList;

public class Eg1 {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Mercedes");
		cars.add("Ferrari");
		cars.add("Jaguar");
		System.out.println("Printing all cars : "+cars);
		System.out.println("Printing all cars using for loop : "+cars);
		for(String c:cars) {
			System.out.println(c);
		}
		System.out.println("Printing last car : "+cars.get(3));
		cars.set(0, "Mustang");
		System.out.println("Updating BMW to "+cars.get(0));
		cars.remove(3);
		System.out.println("Removed Jaguar car : "+cars);
		System.out.println("now removing elements from Cars arraylist..!!");
		cars.clear();
		System.out.println("Removed all cars : "+cars);
		System.out.println("Size of arraylist Cars : "+cars.size());
	}

}
