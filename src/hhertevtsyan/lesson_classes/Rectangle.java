package hhertevtsyan.lesson_classes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle () {
        length = 4;
        width = 5;
    }

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea () {
        return length*width;
    }
}
