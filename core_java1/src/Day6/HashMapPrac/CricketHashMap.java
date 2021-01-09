package Day6.HashMapPrac;

import java.util.*;

public class CricketHashMap {

	public static void main(String[] args) {
		
		HashMap<String , CricketKeshav> cricketHashMap= new HashMap<String , CricketKeshav>();
		
		CricketKeshav c1 = new CricketKeshav(7,"Dhoni");
		CricketKeshav c2 = new CricketKeshav(18,"Virat");
		CricketKeshav c3 = new CricketKeshav(1,"KL Rahul");
		
		cricketHashMap.put("CSK", c1);
		cricketHashMap.put("RCB", c2);
		cricketHashMap.put("K11P", c3);
		
		Set <String> keys = cricketHashMap.keySet();
		for(String k : keys) {
			System.out.println("IPL Team : "+k+" = "+cricketHashMap.get(k));
		}
	}

}
