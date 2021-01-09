package Day7.Assignment7.FileExamples;

import java.io.File;

public class DeletingFile {

	public static void main(String[] args) {
		File file1 = new File("Wrapper.txt");
		boolean result = file1.exists();
		try {
			if(result) {
				System.out.println("File Exists !");
				System.out.println("Now deleting the file..!");
				boolean result2 = file1.delete();
				if(result2) {
					System.out.println("File deleted successfully !");
				}
				else {
					System.out.println("Error occured while deleting file !");
				}
			}
			else {
				System.out.println("File does not Exists ! Hence can't delete ");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
