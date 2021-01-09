package Day4.JavaDates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Eg2 {

	public static void main(String[] args) {
		
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + formattedDate);

	}

}
