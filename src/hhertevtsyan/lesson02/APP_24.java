package hhertevtsyan.lesson02;

public class APP_24 {
    public static void main(String[] args) {
        int a = 2;
        int b = 9;
        int c = 2;
        if ((a == 2 && b == 2 && c != 2) || (a == 2 && c == 2 && b != 2) || (b == 2 && c == 2 && a != 2)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
