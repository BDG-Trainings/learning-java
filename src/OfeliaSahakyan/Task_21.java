package src.OfeliaSahakyan;

public class Task_21 {
    public static void main(String args[]) {
        int a = 42;
        int b = 58;
        int c = 73;
        if (a > b && a > c) {
            System.out.println(a);
        }
        if (b > a && b > c) {
            System.out.println(b);
        }
        if (c > a && c < b) {
            System.out.println(c);
        }
    }
}
