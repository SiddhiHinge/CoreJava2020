package Day5.SetEg;

import java.util.HashSet;
import java.util.Set;

public class Eg1 {

	//Set interface and HashSet class
	
	public static void main(String[] args) {
		
		//Set of numbers/Integers
		
		Set<Integer> setofID = new HashSet<Integer>();
		
		setofID.add(121);
		setofID.add(122);
		setofID.add(123);
		setofID.add(124);

		for(Integer x:setofID) {
			System.out.println(x);
		}
		
	}

}
