package aghalayan.lessons_03;

public class Work10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 3;
        int k = 20;
        if (a < b && b < c && c < k) {
            System.out.println(a);
            }else if (b < a && a < c && c < k) {
                System.out.println(b);
            } else if (c < b && b < a && a < k) {
                System.out.println(c);
            } else if (b < c && c < a && a < k) {
                System.out.println(b);
            } else if (c < a && a < b && b < k) {
                System.out.println(c);
            } else if (a < c && c < b && b < k) {
                System.out.println(a);
            }
        }
    }
