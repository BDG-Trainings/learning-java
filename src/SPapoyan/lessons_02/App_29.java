package SPapoyan.lessons_02;

public class App_29 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        if (a<b && a<c) {
            System.out.println(a);
        } else  {
            if (b<a && b<c) {
                System.out.println(b);
            }
            if (c<a && c<b) {
                System.out.println(c);
            }
        }
        if (a<b && a>c) {
            System.out.println(a);
        } else {
            if (b>a && b<c) {
                System.out.println(b);
            }
            if (c>a && c<b) {
                System.out.println(c);
            } else {
                if (c>b && c<a) {
                    System.out.println(c);
                } if (b<a && b>c) {
                    System.out.println(b);
                }
            }
        }
        if (a>b && a>c) {
            System.out.println(a);
        } else {
            if (b>a && b>c) {
                System.out.println(b);
            }
            if (c>a && c>b) {
                System.out.println(c);
            }
        }

    }
}
