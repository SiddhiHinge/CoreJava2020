package Day5.HashmapEg;

import java.util.*;

public class Eg1 {
	
	//Always keys have to be unique

	public static void main(String[] args) {
	
		HashMap<Integer,String> cityhashMap = new HashMap<Integer,String>();
		
		cityhashMap.put(12, "Pune");
		cityhashMap.put(14, "Pimpri");
		cityhashMap.put(01, "Mumbai");
		
		Set<Integer> keySet = cityhashMap.keySet();
		System.out.println("Printing Cities HashMap using Keys Set - For Each Loop");
		for (Integer key : keySet) {
			System.out.println(key +" "+ cityhashMap.get(key));
		}
		Iterator<Integer> itr = keySet.iterator();
		System.out.println("Printing Cities HashMap Set using - While Iterator Loop");
		Integer key;
		while(itr.hasNext()) {
			key = itr.next();
			System.out.println(key+" "+cityhashMap.get(key));
		}
		
	}

}
