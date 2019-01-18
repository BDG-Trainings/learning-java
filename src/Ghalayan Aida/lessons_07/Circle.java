package Classner;

class Circle {
    private double radius =1.0;
    private String color = "red";
    Circle(){
    }
    Circle(double radius){
       this.radius = radius;
    }
    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void SetRadius(double radius){
        this.radius = radius;

    }public void SetColor(String color){
        this.color = color;
    }public String toString(){
        return "Circle[radius = "+ radius + ", color=" + color + "]";
    }
    public static void main(String []args){
        Circle a = new Circle(10.3, "blue") ;
        String x = a.toString();
        System.out.print(x.toString());
    }
}
