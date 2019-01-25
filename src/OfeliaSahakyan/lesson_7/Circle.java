package src.ofeliasahakyan.lesson_7;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        radius=1.0;
        color="red";
    }
    public Circle(double radius){
        this.radius=radius;
        color="red";
    }
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
     }

    public double getRadius(){return radius;}
    public String getColor(){return color;}
    public void setRadius(double radius){this.radius=radius;}
    public void setColor(String color){this.color=color;}
    public double getArea(){ return Math.PI*Math.pow(this.radius,2); }

    public String toString() {
        return "Circle[radius=" + radius + "," + "color=" + color + "]";
        }
}
