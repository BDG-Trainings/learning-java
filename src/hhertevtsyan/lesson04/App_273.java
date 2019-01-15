package hhertevtsyan.lesson04;

public class App_273 {
    public static void main(String[] args) {
        int n = 26;
        int indexsum = 0;
        char x[] = {'s', 'b', 's', 't', 'e', 'b', 's', 'b', 'b', 'a', 'n', 's', 'h', 'a', 'b', 'i', ' ', 'b', 'a', 'b', 'i', 'a', 'b', 's', 'b', 'b'};
//        System.out.println("X Զանգվածի երկարությունը = " + n);
        for (int i = 0; i < n; i = i + 1) {
            if (x[i] == 's') {
                indexsum = indexsum + i;
            }
        }
       System.out.println("Արդյունքը = " + indexsum);
    }
}
