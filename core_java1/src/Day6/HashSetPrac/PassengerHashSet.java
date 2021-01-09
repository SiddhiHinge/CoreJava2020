package Day6.HashSetPrac;

import java.util.*;

public class PassengerHashSet {

	public static void main(String[] args) {
		
		Set<PassengerDeeksha> passengerArray = new HashSet<PassengerDeeksha>();
		
		PassengerDeeksha p1 = new PassengerDeeksha("Harry Potter",121);
		PassengerDeeksha p2 = new PassengerDeeksha("Tony Stark",171);
		PassengerDeeksha p3 = new PassengerDeeksha("Draco Malfoy",191);
		
		passengerArray.add(p1);
		passengerArray.add(p2);
		passengerArray.add(p3);
		
		Iterator<PassengerDeeksha> itr = passengerArray.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
