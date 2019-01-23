package hhertevtsyan.lesson_classes;

public class Trianglepyramid {
    private Triangle triangle;
    private double h;

    public Trianglepyramid (Triangle triangle, double h) {
        this.triangle =triangle;
        this.h = h;
    }

    public double getVolume () {
        return (triangle.getArea()*h)/3;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(4,4,7);
        Trianglepyramid pyramid = new Trianglepyramid(triangle, 5);
        System.out.println("Volume =" + pyramid.getVolume());
    }
}
