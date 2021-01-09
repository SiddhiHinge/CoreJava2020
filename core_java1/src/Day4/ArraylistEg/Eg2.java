package Day4.ArraylistEg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Eg2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> flowers = new ArrayList<String>();
		flowers.add("Lily");
		flowers.add("Rose");
		flowers.add("Jasmine");
		flowers.add("Hibiscus");
		
		Collections.sort(flowers);
		
		for(int i=0 ; i< flowers.size();i++) {
			System.out.println(flowers.get(i));
		}
	}

}
