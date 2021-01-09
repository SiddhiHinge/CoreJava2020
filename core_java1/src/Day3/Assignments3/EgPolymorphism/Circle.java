package Day3.Assignments3.EgPolymorphism;

public class Circle extends Shape{
	double radius;
	public void aboutShape() {
		super.aboutShape();
		System.out.println("Circle is also a shape. It uses radius.");
	}
	public double area(double radius) {
		this.radius = 3.14*radius*radius;
		return this.radius;
	}
}
