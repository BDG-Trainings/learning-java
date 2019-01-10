package aghalayan.lessons_02;
public class Homework28 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 2;
        if (a <= b && b < c) {
            if (c / b == b / a && c % b == b % a) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }} else if (b <= a && a < c) {
            if (c / a == a / b && c % a == a % b) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }} else if (c <= b && b < a) {
            if (a / b == b / c && a % b == b % c) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }} else if (b <= c && c < a) {
            if (a / c == c / b && a % c == c % b) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }} else if (c <= a && a < b) {
            if (b / a == a / c && b % a == a % c) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }} else if (a <= c && c < b) {
            if (b / c == c / a && b % c == c % a) {
                System.out.println(true);
            } else  {
                System.out.println(false);
            }}else {
            System.out.println(true);
        }
    }
}
