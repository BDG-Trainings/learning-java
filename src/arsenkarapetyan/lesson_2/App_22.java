package arsenkarapetyan.lesson_2;

public class App_22 {

    public static void main(String[] args) {

        int a = 20;
        int b = 36;
        int c = -2;
        int min = a;

        if (b < min){
            min=b;
        }
        if (c < min){
            min=c;
        }

        System.out.println("min value is " + min);
    }
}
