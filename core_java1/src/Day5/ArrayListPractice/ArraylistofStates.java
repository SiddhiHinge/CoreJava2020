package Day5.ArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import Day5.ArrayListPractice.BeanClass.States;

public class ArraylistofStates {

	static Scanner s1 = new Scanner(System.in);
	static Scanner s2 = new Scanner(System.in);
	static Scanner s3 = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<States> statesArray = new ArrayList<States>();
		String ans = "Y";
		
		while(ans.equalsIgnoreCase("Y")) {
			
			System.out.println("Enter City code and City name : ");
			States s = new States(s1.nextInt(),s2.nextLine());
			statesArray.add(s);
			System.out.println("Do you want enter (Y/N) : ");
			ans = s3.next();
		}
		Iterator<States> itr = statesArray.iterator();
		
		while(itr.hasNext()) {
			States s = itr.next();
			System.out.println("City Code : "+s.getCityCode());
			System.out.println("City Name : "+s.getCity());
			System.out.println("---------------------------------------------");
		}

	}

}
