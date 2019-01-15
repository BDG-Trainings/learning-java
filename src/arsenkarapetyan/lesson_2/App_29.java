package arsenkarapetyan.lesson_2;

public class App_29 {
    public static void main(String[] args) {

        int a = 30;
        int b = 11;
        int c = 7;
        if (a < b && a < c) {
            System.out.print(a + "\t");
            if (b < c) {
                System.out.print(b + "\t");
                System.out.print(c + "\t");
            } else {
                System.out.print(c + "\t");
                System.out.print(b + "\t");
            }
        }

        if (b < a && b < c) {
            System.out.print(b + "\t");
            if (a < c) {
                System.out.print(a + "\t");
                System.out.print(c + "\t");
            } else {
                System.out.print(c + "\t");
                System.out.print(a + "\t");
            }
        }

        if (c < a && c < b) {
            System.out.print(c + "\t");
            if (a < b) {
                System.out.print(a + "\t");
                System.out.print(b + "\t");
            } else {
                System.out.print(b + "\t");
                System.out.print(a + "\t");
            }
        }
    }
}

