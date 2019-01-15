package hhertevtsyan.lesson02;

public class APP_36 {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        int c = 50;
        int d = 400;
        int count = 0;
        if (a%2 != 0 && b%2 != 0 || a%2 != 0 && c%2 != 0 || a%2 != 0 && d%2 != 0 || b%2 != 0 && c%2 != 0 ||  b%2 != 0 && d%2 != 0 || c%2 != 0 && d%2 != 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
