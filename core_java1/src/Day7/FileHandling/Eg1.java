package Day7.FileHandling;

import java.io.File;

public class Eg1 {

	public static void main(String[] args) {
		try {
			//File file1 = new File("Courses.txt");//This line only creates file object
			File file1 = new File("E:\\Siddhi\\ZENSAR\\CoreJavaEclipse\\core_java1\\src\\Day7\\FileHandling\\Names.txt");
			boolean result = file1.createNewFile(); //This line actually create the file in folder
			if(result) {
				System.out.println("File created successfully !" + file1.getName());
			}
			else {
				System.out.println("File already exists !");
			}
		}
		catch(Exception e) {
			System.out.println("Exception occurred : ");
		}
	}

}
