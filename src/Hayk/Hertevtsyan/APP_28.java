package Hayk.Hertevtsyan;

public class APP_28 {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int c = 2;
        if (a > b && a > c) {
            if ((a % b == a * a % c * c) || (a % c == a * a % b * b)) {
                System.out.println("TRUE");
            } else {
                if ((b > a && b > c) && ((b % a == b * b % c * c) || (b % c == b * b % a * a))) {
                    System.out.println("TRUE");
                } else {
                    if ((c / a == c * c % b * b) || (c / b == c * c / a * a)) {
                        System.out.println("TRUE");
                    } else {
                        System.out.println("FALSE");
                    }
                }
            }

        }
    }
}