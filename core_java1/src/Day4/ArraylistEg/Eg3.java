package Day4.ArraylistEg;

import java.util.*;

public class Eg3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> flowers = new ArrayList<String>();
		flowers.add("Lily");
		flowers.add("Rose");
		flowers.add("Jasmine");
		flowers.add("Hibiscus");
		
		Iterator<String> iterator = flowers.iterator();
		//.iterator() is used to assign flowers
		
		while(iterator.hasNext()) {
			String f = iterator.next();
			System.out.println(f);
		}
		
		//in java Class name starts with capital and method name starts with small letter
		
	}

}
