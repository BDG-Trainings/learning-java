package arsenkarapetyan.lesson_7;

public class Circle {

    private double radius;
    private String color;

    public Circle(){
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius){
        setRadius(radius);
        color = "red";
    }

    public Circle(double radius, String color){
        setRadius(radius);
        setColor(color);
    }

    public double getRadius (){
        return radius;
    }

    public String getColor (){
        return color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return "Radius is equal: " + getRadius() + " and color is equal: " + getColor();
    }

    public double getArea(){
        return Math.PI * Math.pow((double)this.radius, 2);

    }

    public static void main(String[] args) {
        Circle c = new Circle(5, "black");
        System.out.println(c.toString());
        System.out.println("Area is equal: " + c.getArea());
        Circle c1 = new Circle ();
        System.out.println(c1.toString());
        System.out.println("Area is equal: " + c1.getArea());
    }
}


