package Day7.Assignment7.FileExamples;

import java.io.File;

public class CreatingFile {

	public static void main(String[] args) {
		File file1 = new File("Wrapper.txt");
		try {
			boolean result = file1.createNewFile();
			if(result) {
				System.out.println("File created !");
			}
			else {
				System.out.println("File not created !");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
