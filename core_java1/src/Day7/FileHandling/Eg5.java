package Day7.FileHandling;

import java.io.File;

public class Eg5 {

	public static void main(String[] args) {
		try {
			File folder = new File("E:\\Siddhi\\ZENSAR\\CoreJavaEclipse\\core_java1\\src\\Day7\\FileHandling\\TestFolder");
			folder.mkdir();
			System.out.println("Folder created !");
			if (folder.exists()) {
				
				System.out.println("Now deleting the folder...");
				if(folder.delete()) {
					System.out.println("Folder deleted successfully !");
				}
				else {
					System.out.println("Folder not deleted successfully !");
				}
			}
			else {
				System.out.println("Folder does not exists !");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
