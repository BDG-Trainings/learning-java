package Hayk.Hertevtsyan.lesson02;

public class APP_25 {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int c = 2;
        int y;
        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            y = 1;
            System.out.println(y);
        } else {
            y = 2;
            System.out.println(y);
        }
    }
}
