package Day2.arrays;

public class Eg1 {

	public static void main(String[] args) {
		String[] names = {"Harry","Ron","Draco"};
		/*
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]); */
		
		// System.out.println(names[4]); 
		//java.lang.ArrayIndexOutOfBoundsException - 
		// We are using index of array which is not avail
		
		
		 System.out.println(names.length);
		 /*
		for ( int i = 0;i <= names.length;i++) {
			System.out.println(names[i]);
		}*/
		// when we use length then we should not use =
		
		for ( int i = 0;i < names.length;i++) {
			String x = names[i];
			System.out.println(x);
		}
	}

}
