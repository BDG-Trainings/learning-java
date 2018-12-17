package SPapoyan.lessons_02;

public class App_35 {
    public static void main(String[] args) {

        int a = 8;
        int b = 5;
        int c = 7;
        int d = 20;

        if (a == b+c+d || b == a+c+d || c == a+b+d || d == a+b+c) {
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }


    }
}