package vkaramyan.lesson_6;

public class Circle_simplified {

	double radius = 1.0;

	public Circle_simplified() {
		
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
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	public double getCircumference() {
		double circumference = Math.PI * (2 * radius);
		return circumference;

	}

	public String toString() {
		return String.format("Circle[radius= %s]", getRadius());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle_simplified circle = new Circle_simplified();
		System.out.println(circle);
		circle.setRadius(3.0);
		System.out.println(circle.getArea());
		System.out.println(circle.getCircumference());
		

	}

}
