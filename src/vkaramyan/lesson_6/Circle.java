package vkaramyan.lesson_6;

public class Circle {

	private double radius = 1.0;
	private String color = "red";

	public Circle() {

	}

	public Circle(double r) {
		radius = r;
	}

	public Circle(double r, String color) {
		radius = r;
		color = "red";
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return String.format("Circle[radius = %f, color = %s]", radius, color);

	}

	public double getArea() {
		double Area = Math.PI * Math.pow(radius, 2);
		return Area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle_1 = new Circle();
		System.out.println(circle_1.getArea());

		Circle circle_2 = new Circle(2.0);
		System.out.println(circle_2.getArea());

		Circle circle_3 = new Circle(3.0, "red");
		System.out.println(circle_3.getArea());

	}

}
