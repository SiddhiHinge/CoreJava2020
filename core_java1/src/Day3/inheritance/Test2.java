package Day3.inheritance;

public class Test2 {

	public static void main(String[] args) {
		Vehicle car = new Car();
		car.start();
		car.stop();
	}
	//An object of a child class can be stored in a reference of a parent class
	//but not vice-versa.
}
