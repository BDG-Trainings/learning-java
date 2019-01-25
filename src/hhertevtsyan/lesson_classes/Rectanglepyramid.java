package hhertevtsyan.lesson_classes;

public class Rectanglepyramid {
    private Rectangle rectangle;
    private double h;

    public Rectanglepyramid (Rectangle rectangle, double h) {
        this.rectangle = rectangle;
        this.h = h;
    }

    public double getVolume () {
        return rectangle.getArea()*h/3;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        Rectanglepyramid pyramid = new Rectanglepyramid(rectangle, 5);
        System.out.println("Volume = " + pyramid.getVolume());
    }
}
