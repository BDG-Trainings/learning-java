package hhertevtsyan.lesson02;

public class APP_30 {
    public static void main(String[] args) {
        int a = 97;
        int b = 900;
        int c = 526;
        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            }
        }
        if (b > a && b > c) {
            if (a > c) {
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }
        }
        if (c > a && c > c) {
            if (b > a) {
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            } else {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
        }
    }
}
