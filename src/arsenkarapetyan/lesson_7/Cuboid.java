package arsenkarapetyan.lesson_7;

public class Cuboid {

    private float lenght;
    private float width;
    private float height;

    public Cuboid (){
        lenght = 1.0f;
        width = 1.0f;
        height = 1.0f;
    }

    public Cuboid (float lenght, float width, float height){
        setLenght(lenght);
        setWidth(width);
        setHeight(height);
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLenght() {
        return lenght;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getArea (){
        return getLenght() * getWidth() * getHeight();
    }

    @Override
    public String toString() {
        return "Cube with following params: " + getLenght() + ", " + getWidth() + ", " + getHeight();
    }

    public static void main(String[] args) {
        Cuboid cu = new Cuboid();
        System.out.println(cu.toString());
        System.out.println("Area is equal: " + cu.getArea());

        System.out.println();

        Cuboid cu1 = new Cuboid(5.0f, 3.0f, 2.0f);
        System.out.println(cu1.toString());
        System.out.println("Area is equal: " + cu1.getArea());

    }
}


