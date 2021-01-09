package Day1.strings;

public class Example8 {

	public static void main(String[] args) {
		String num1 = "30";
		String num2 = "40";
		//int x = int (num1);
		//We cannot convert String to int by manual casting
		System.out.println("Addition:"+(num1+num2));
		String str = "My name is Harry";
		int i = str.indexOf('m', 2);
		System.out.println("Index of char from a index:"+i);
		i = str.indexOf("is");
		System.out.println("Index of char from String:"+i);
		i = str.lastIndexOf('r');
		System.out.println("Last Index of char:"+i);
		i = str.indexOf('r');
		System.out.println("Index of char:"+i);
	}

}
