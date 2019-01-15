package hhertevtsyan.lesson02;

public class APP_35 {
    public static void main(String[] args) {
        int a = 800;
        int b = 100;
        int c = 300;
        int d = 400;
        if (a == b + c + d || b == a + c + d || c == a + b + d || d == a + b + c) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
