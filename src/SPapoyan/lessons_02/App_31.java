package SPapoyan.lessons_02;

public class App_31 {

    public static void main(String[] args) {

        int a = 8;
        int b = 20;
        int c = 3;
        int d = 5;

        if (a>b && a>c && a>d) {
            System.out.println(a);
        } else {
            if (b>a && b>c && b>d) {
                System.out.println(b);
            }
        } if (c>b && c>a && c>d) {
            System.out.println(c);
        } else {
            if (d>a && d>b && d>c) {
                System.out.println(d);
            }
        }
    }

}
