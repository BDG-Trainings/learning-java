package arsenkarapetyan.lesson_7;

public class Rectangle {

    private float length;
    private float width;

    public Rectangle (){
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle (float lenght, float width){
        setLenght(lenght);
        setWidth(width);
    }

    public float getLenght(){
        return length;
    }

    public void setLenght(float lenght){
        this.length = lenght;
    }

    public float getWidth(){
        return width;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public double getArea (){
        return length * width;
    }

    public double getPerimeter (){
        return (length + width) * 2;
    }

    public String toString (){
        return "Length: " + getLenght() + ", width: " + getWidth();
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle (12.0f, 5.0f);
        System.out.println("Area is: " + rec.getArea());
        System.out.println("Perimeter is: " + rec.getPerimeter());
        System.out.println(rec.toString());
        System.out.println();
        Rectangle rec1 = new Rectangle ();
        System.out.println("Area is: " + rec1.getArea());
        System.out.println("Perimeter is: " + rec1.getPerimeter());
        System.out.println(rec1.toString());
    }
}
