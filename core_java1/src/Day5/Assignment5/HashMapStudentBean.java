package Day5.Assignment5;
import java.util.*;
import Day3.Beans.*;
public class HashMapStudentBean {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		
		//HashSet<Integer> studentmarks = new HashSet<Integer>();
		HashMap<HashSet,Student> studentMap = new HashMap<HashSet,Student>();
		String ans = "Y";

		while (ans.equalsIgnoreCase("Y")) {
			System.out.println("Enter Student RollNo , Name and Course : ");
			Student s = new Student(s2.nextInt(),s1.nextLine(),s3.next());
			System.out.println("Enter Student 3 subjects marks : ");
			HashSet<Integer> studentmarks = new HashSet<Integer>();
			studentmarks.add(s2.nextInt());
			studentmarks.add(s2.nextInt());
			studentmarks.add(s2.nextInt());
			studentMap.put(studentmarks,s);
			System.out.println("Do you want to add (Y/N) : ");
			ans = s3.next();
		}
		
		//System.out.println(studentMap);
		Set<HashSet> marks = studentMap.keySet();
		Iterator<HashSet> itr = marks.iterator();
		HashSet key;
		System.out.println("Displaying using iterator !");
		while(itr.hasNext()) {
			key = itr.next();
			System.out.println("Marks : "+key+" , "+studentMap.get(key));
		}
		
		System.out.println("\n-----------------------------------------------------------\n");
		
		System.out.println("\nDisplaying using for each !");
		for(HashSet k : marks) {
			System.out.println("Marks : "+ k + " , "+studentMap.get(k));
		}
		
	}

}
