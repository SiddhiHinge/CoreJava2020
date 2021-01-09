package Day7.Assignment7.FileExamples;

import java.io.File;
import java.io.FileWriter;

public class WritingToFile {

	public static void main(String[] args) {
		
		File file1 = new File("Wrapper.txt");
		Integer myInteger = 101;
		String myString = myInteger.toString();
		boolean result = file1.exists();
		try {
			if (result) {
				System.out.println("File Exists !");
				FileWriter fileWriter = new FileWriter(file1);
				fileWriter.write("Integer is "+myInteger+"\n");
				fileWriter.write("Converting Integer to String using toString()...\n");
				fileWriter.write("String is "+myString+"\n");
				fileWriter.write("...Done...");
				fileWriter.close();
				System.out.println("Written to file successfully !");
			}
			else {
				System.out.println("File does not Exists !");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
