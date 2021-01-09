package Day4.ArraylistEg;

import java.util.*;

public class Eg5 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<String>();
		String ans = "Y";
		
		while(ans.equalsIgnoreCase("Y")){
			
			System.out.println("Enter animal name : ");
			animals.add(sc.next());
			System.out.println("Do you want to enter animal ? (Y/N) : ");
			ans = sc.next();
			
		}

		System.out.println(animals);

	}

}
