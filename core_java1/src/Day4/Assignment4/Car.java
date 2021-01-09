package Day4.Assignment4;

public class Car extends Vehicle {

	public Car() {
		super();
		System.out.println("Car is a vehicle");
	}

	public static void main(String[] args) {

		Car car = new Car();
		car.aboutVehicle();
		car.use();

	}

	@Override
	public void use() {

		System.out.println("Car has a Use. It is used to drive from one place to another");

	}

	@Override
	public void aboutVehicle() {
		System.out.println("Every Machine has a Use/Functionality");
		
	}

}
