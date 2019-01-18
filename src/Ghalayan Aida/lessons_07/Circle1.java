package Classner;

import java.awt.geom.Area;

class Circle1 {
    private double radius= 1.0;
    Circle1(){
    }
    Circle1(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void SetRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return Math.PI*radius*radius;
    }
    public String toString(){
        return "Cirkle [radius = " + radius + "]";
    }
    public static void main(String [] args){
        Circle1 X = new Circle1(10.0);

        System.out.print(X.getArea());
    }
}
