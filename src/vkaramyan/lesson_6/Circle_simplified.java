package vkaramyan.lesson_6;

public class Circle_simplified {

	double radius;

	public Circle_simplified() {
		radius = 1.0;
	}

	public Circle_simplified(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return getArea();
	}

	public double getCircumference() {
		return Math.PI * (2 * radius);

	}

	public String toString() {
		return "Circle[radius= + radius ]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle_simplified circle_1 = new Circle_simplified();
		System.out.println(circle_1.getCircumference());

		Circle_simplified circle_2 = new Circle_simplified(3);
		System.out.println(circle_2.getCircumference());

	}

}
