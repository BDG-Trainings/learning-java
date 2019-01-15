package hhertevtsyan.lesson02;

public class APP_32 {
    public static void main(String[] args) {
        int a = 97;
        int b = 990;
        int c = 1126;
        int d = 34;
        if (a < b && a < c && a < d) {
            System.out.println("Min=" + a);
        } else if (b < a && b < c && b < d) {
            System.out.println("Min=" + b);
        } else if (c < a && c < b && c < d) {
            System.out.println("Min=" + c);
        } else {
            System.out.println("Min=" + d);
        }
    }
}
