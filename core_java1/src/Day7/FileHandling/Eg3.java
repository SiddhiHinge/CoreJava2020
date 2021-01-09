package Day7.FileHandling;

import java.io.File;
import java.util.Scanner;

public class Eg3 {

	public static void main(String[] args) {
		File file1 = new File("Courses.txt");
		try {
			 Scanner sc = new Scanner(file1);
			while(sc.hasNext()) {
				String s = sc.nextLine();
				System.out.println(s);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
