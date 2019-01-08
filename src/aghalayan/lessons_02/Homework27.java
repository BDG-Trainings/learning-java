package aghalayan.lessons_02;
public class Homework27 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 8;
        if (a - b == b - a) {
            System.out.println(true);
        } else if (b - a == a - c) {
            System.out.println(true);
        } else if (c - b == b - a) {
            System.out.println(true);
        } else if (c - a == a - b) {
            System.out.println(true);
        } else if (a - c == c - b) {
            System.out.println(true);
        } else if (b - c == c - a) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
