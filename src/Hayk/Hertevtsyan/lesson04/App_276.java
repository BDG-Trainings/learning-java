package Hayk.Hertevtsyan.lesson04;

public class App_276 {
    public static void main(String[] args) {
        int n = 26;
        boolean t = false;
        char x[] = {'b', 'r', 'b', 't', 'e', 'b', 'b', 'b', 'b', 'a', 'n', 'b', 'h', 'a', 'b', 'k', ' ', 'b', 'a', 'b', 'h', 'a', 'b', 'a', 'b', 'b'};
//        System.out.println("X Զանգվածի երկարությունը = " + n);
        for (int i = 0; i < n; i = i + 1) {
            if (x[i] == 'r') {
                i = n;
                t = true;
            }
        }
        System.out.println("Արդյունքը = " + t);
    }
}
