package hhertevtsyan.lesson02;

public class APP_34 {
    public static void main(String[] args) {
        int a = 200;
        int b = 100;
        int c = 300;
        int d = 400;
        if (a + b == c + d || a + c == b + d || a + d == b + c) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
