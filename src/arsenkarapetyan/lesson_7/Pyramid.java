package arsenkarapetyan.lesson_7;

public class Pyramid {

    private double length;
    private double height;

    public Pyramid(){
        length = 1;
        height = 1;
    }

    public Pyramid(double length, double height){
        setLength(length);
        setHeight(height);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return height * length * length * 1/3 * Math.sqrt(3)/4;
    }

    public String toString(){
        return "Pyramid base side is equal: " + getLength() + ", height is equal: " + getHeight() +
                ", area is equal: " + getArea();
    }

    public static void main(String[] args) {
        Pyramid pyr = new Pyramid();
        System.out.println(pyr.toString());

        System.out.println();

        Pyramid pyr1 = new Pyramid(5,7);
        System.out.println(pyr1.toString());
    }
}
