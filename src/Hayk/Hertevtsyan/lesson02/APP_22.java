package Hayk.Hertevtsyan.lesson02;

public class APP_22 {
    public static void main(String[] args) {
        int a = 97;
        int b = 90;
        int c = 26;
        if (a < b && a < c) {
            System.out.println("Min=" + a);
        } else { if (b < a && b < c) {
            System.out.println("Min=" + b);
        }
        else {
            System.out.println("Min=" + c);
        }
        }
    }
}
