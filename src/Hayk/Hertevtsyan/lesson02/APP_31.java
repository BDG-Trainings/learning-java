package Hayk.Hertevtsyan.lesson02;

public class APP_31 {
    public static void main(String[] args) {
        int a = 97;
        int b = 990;
        int c = 1126;
        int d = 134;
        if (a > b && a > c && a > d) {
            System.out.println("Max=" + a);
        } else if (b > a && b > c && b > d) {
            System.out.println("Max=" + b);
        } else if (c > a && c > b && c > d) {
            System.out.println("Max=" + c);
        } else {
            System.out.println("Max=" + d);
        }
    }
}
