package arsenkarapetyan.lesson_7;

public class Circle {

    private double radius=1.0;
    private String color = "red";

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
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
        String str = "Radius is equal: " + this.radius + " and color is equal: " + this.color;
        return str;
    }

    public double getArea(){
        double area = Math.PI * Math.pow((double)this.radius, 2);
        return area;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5, "black");
        System.out.println(c.toString());
        System.out.println("Area is equal: " + c.getArea());
    }
}


