package Day6.HashMapPrac;

import java.util.*;

public class MobileHashMap {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		HashMap<Integer,MobileNooral> mobileHashMap = new HashMap<Integer,MobileNooral>();
		String ans = "Y";
		
		while(ans.equalsIgnoreCase("Y")) {
			System.out.println("Enter Mobile name and price : ");
			MobileNooral m = new MobileNooral(s2.next(),s1.nextInt());
			System.out.println("Enter Mobile Model No : ");
			mobileHashMap.put(s1.nextInt(), m);
			System.out.println("Do you want to enter Mobile Details (Y/N) : ");
			ans = s2.next();
		}
		
		Set<Integer> modelNos = mobileHashMap.keySet();
		Iterator<Integer> itr = modelNos.iterator();
		int mNo;
		while(itr.hasNext()) {
			mNo = itr.next();
			System.out.println("Model No : "+mNo+" , "+mobileHashMap.get(mNo));
		}
	}
	

}
