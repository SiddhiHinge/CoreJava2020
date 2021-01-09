package Day5.SetEg;
import java.util.*;
public class Eg3 {

	public static void main(String[] args) {
		
		Set<String> flowers = new HashSet<String>();
		int i=0;
		flowers.add("Lily");
		flowers.add("Mogra");
		flowers.add("Jasmine");
		flowers.add("Tulip");
		
		Iterator<String> itr = flowers.iterator();
		
		System.out.println("Printing Set using - While Iterator Loop");
		while(itr.hasNext()) {	
			System.out.println("Flower "+(i+1)+": "+itr.next());
			i++;
		}
		
		System.out.println("\nPrinting Set using - For Each Loop");
		for(String f : flowers) {
			System.out.println(f);
		}
	}

}
