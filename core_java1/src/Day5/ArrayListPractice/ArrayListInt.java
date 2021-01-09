package Day5.ArrayListPractice;

import java.util.*;

public class ArrayListInt {
	
	static Scanner s1 = new Scanner(System.in);
	static Scanner s2 = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<Integer> allSemPercent = new ArrayList<Integer>();
		
		String ans = "Y";
		int i = 0;
		
		while(ans.equalsIgnoreCase("Y")) {
			
			System.out.println("Enter percentage of Sem "+(i+1)+" :");
			allSemPercent.add(s1.nextInt());
			System.out.println("Do you want to enter ? (Y/N) : ");
			ans = s2.nextLine();
			i++;
		}
		
		Iterator<Integer> itr = allSemPercent.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
