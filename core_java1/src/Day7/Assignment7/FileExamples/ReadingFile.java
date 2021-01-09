package Day7.Assignment7.FileExamples;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) {
		
		File file1 = new File("Wrapper.txt");
		boolean result = file1.exists();
		try {
			if(result) {
				System.out.println("File Exists! Hence can be read.\n");
				Scanner sc = new Scanner(file1);
				System.out.println("Displaying the contents of "+file1.getName()+"\n");
				while(sc.hasNext()) {
					String sentence = sc.nextLine();
					System.out.println(sentence);
				}
			}
			else {
				System.out.println("File does not Exists! Hence cannot be read.\n");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
