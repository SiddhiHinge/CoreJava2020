package Day3.Assignments3.EgPolymorphism;

public class TestShape {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.aboutShape();
		
		Square square = new Square();
		square.aboutShape();
		double sqrArea = square.area(4);
		System.out.println("Area of square : "+sqrArea);
		
		Circle circle = new Circle();
		circle.aboutShape();
		double circleArea = circle.area(4);
		System.out.println("Area of Circle : "+circleArea);
		

	}

}
