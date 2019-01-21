package arsenkarapetyan.lesson_7;

public class Rectangle {

    private float lenght = 1.0f;
    private float width = 1.0f;

    public Rectangle (){}

    public Rectangle (float lenght, float width){
        setLenght(lenght);
        setWidth(width);
    }

    public float getLenght(){
        return lenght;
    }

    public void setLenght(float lenght){
        this.lenght = lenght;
    }

    public float getWidth(){
        return width;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public double getArea (){
        return lenght * width;
    }

    public double getPerimeter (){
        return (lenght + width) * 2;
    }

    public String toString (){
        return "Lenght: " + lenght + ", width: " + width;
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle (12.0f, 5.0f);
        System.out.println("Area is: " + rec.getArea());
        System.out.println("Perimeter is: " + rec.getPerimeter());
        System.out.println(rec.toString());
    }
}
