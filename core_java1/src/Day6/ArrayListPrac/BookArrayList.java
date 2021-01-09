package Day6.ArrayListPrac;

import java.util.ArrayList;

public class BookArrayList {

	public static void main(String[] args) {
		
		ArrayList<BookChanda> bookArray = new ArrayList<BookChanda>();
		BookChanda b1 = new BookChanda("Harry Potter",1000,100);
		BookChanda b2 = new BookChanda("The Secret",300,200);
		BookChanda b3 = new BookChanda("The Cook Book",800,300);
		
		bookArray.add(b1);
		bookArray.add(b2);
		bookArray.add(b3);
		
		for(BookChanda b : bookArray) {
			System.out.println(b);
		}
	}

}
