package Day7.FileHandling;

import java.io.File;

public class Eg4 {

	public static void main(String[] args) {
		File file1 = new File("E:\\Siddhi\\ZENSAR\\CoreJavaEclipse\\core_java1\\src\\Day7\\FileHandling\\Names.txt");
		boolean result = file1.exists();
		if(result) {
			System.out.println(file1.getName()+" this file exists !");
			System.out.println("Now deleting the file...");
			boolean deletefile = file1.delete();
			if(deletefile) {
				System.out.println("File deleted successfully !");
			}
			else {
				System.out.println("File not deleted !");
			}
		}
		else {
			System.out.println("File do not Exists !");
		}
	}

}
