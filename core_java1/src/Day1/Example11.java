package Day1;

public class Example11 {

	public static void main(String[] args) {
		char c1 = '1';
        int i = (int) c1;
        System.out.println(c1+"  "+i);
        i = Character.getNumericValue(c1);
        System.out.println(c1+" "+i);


        
        double value = 22.2;
        char c2 = (char) value;
        System.out.println(value+"  "+c2);

	}

}
