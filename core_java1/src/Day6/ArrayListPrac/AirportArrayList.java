package Day6.ArrayListPrac;

import java.util.ArrayList;

public class AirportArrayList {

	public static void main(String[] args) {
		
		ArrayList<AirportAnkur> airportArray = new ArrayList<AirportAnkur>();
		AirportAnkur a1 = new AirportAnkur(1234,"AirIndia","11:30");
		AirportAnkur a2 = new AirportAnkur(4567,"Indigo","12:30");
		AirportAnkur a3 = new AirportAnkur(7890,"SpiceJet","02:30");
		airportArray.add(a1);
		airportArray.add(a2);
		airportArray.add(a3);
		
		System.out.println("Displaying the Airport details using For Loop\n");
		for(int i = 0 ; i < airportArray.size() ; i++) {
			AirportAnkur a = airportArray.get(i);
			System.out.println(a);
		}
	}

}
