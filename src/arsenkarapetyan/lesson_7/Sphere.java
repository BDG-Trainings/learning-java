package arsenkarapetyan.lesson_7;

public class Sphere {

    private double radius;

    public Sphere(){
        radius = 1;
    }

    public Sphere(double radius){
        setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return 4/3 * Math.PI * radius * radius * radius;
    }

    public String toString() {
        return "Sphere radius is equal: " + getRadius() + ", Area is equal: " + getArea();
    }

    public static void main(String[] args) {
        Sphere sph = new Sphere();
        System.out.println(sph.toString());
        System.out.println();
        Sphere sph1 = new Sphere(5);
        System.out.println(sph1.toString());
    }
}
