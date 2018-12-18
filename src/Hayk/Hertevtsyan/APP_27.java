package Hayk.Hertevtsyan;

public class APP_27 {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int c = 6;
        if ((b - a == 2*(b - c)) || (a - b == 2*(a - c)) || (b - c == 2*(b - a)) || (c - b == 2*(c - a)) || (a - c == 2*(a - b)) || (c - a == 2*(c - b))) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
