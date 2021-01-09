package Day5.HashmapEg;

import java.util.HashMap;

public class Eg3 {

	public static void main(String[] args) {

		HashMap<Integer,Double> sqrtList = new HashMap<Integer,Double>();

		sqrtList.put(7,Math.sqrt((double)7));
		sqrtList.put(2,Math.sqrt((double)2));
		sqrtList.put(9,Math.sqrt((double)9));
		sqrtList.put(25,Math.sqrt((double)25));
				
		System.out.println(sqrtList);
	}

}
