package Day7.FileHandling;

import java.io.*;
import java.util.Scanner;

public class Eg2 {
	
	static Scanner sc = new Scanner(System.in);
	//Writing into the File
	public static void main(String[] args) {
		
		try {
			String[] courses = new String[5] ;
			
			for (int i = 0 ; i < 5 ; i++) {
				System.out.println("Enter "+i+" Courses : ");
				courses[i] = sc.next();
			}
		
			FileWriter fileWriter = new FileWriter("Courses.txt");
			for (String c: courses) {
				fileWriter.write(c+"\n");
			}

			fileWriter.close();
			System.out.println("File written successfully !");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
