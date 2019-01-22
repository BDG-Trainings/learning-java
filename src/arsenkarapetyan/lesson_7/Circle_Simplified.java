package arsenkarapetyan.lesson_7;

public class Circle_Simplified {

    private double radius;

    public Circle_Simplified(){
        radius = 1.0;
    }

    public Circle_Simplified(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * Math.pow((double)this.radius, 2);
        return area;
    }

    public double getCircumference(){
        double area = 2 * Math.PI * this.radius;
        return area;
    }

    public String toString(){
        String str = "Radius is equal: " + getRadius() + ", Area is equal: " + getArea() + ", Circumference is equal: " + getCircumference();
        return str;
    }

    public static void main(String[] args) {

        Circle_Simplified cs = new Circle_Simplified(12);
        System.out.println(cs.toString());

        System.out.println();

        Circle_Simplified cs1 = new Circle_Simplified();
        System.out.println(cs1.toString());
    }
}
