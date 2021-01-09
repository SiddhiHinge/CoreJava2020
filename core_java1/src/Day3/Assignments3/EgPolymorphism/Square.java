package Day3.Assignments3.EgPolymorphism;

public class Square extends Shape{
	private double side;
	public void aboutShape() {
		System.out.println("Square is also a shape. It has four side.");
	}
	public double area(double side) {
		this.side = (side * side);
		return this.side;
	}
}
