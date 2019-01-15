package hhertevtsyan.lesson04;

public class App_274 {
    public static void main(String[] args) {
        int n = 26;
        int count = 0;
        int indexsum = 0;
        char x[] = {'b', 'b', 'b', 't', 'e', 'b', 'b', 'b', 'b', 'a', 'n', 'b', 'h', 'a', 'b', 'k', ' ', 'b', 'a', 'b', 'h', 'a', 'b', 'a', 'b', 'b'};
//        System.out.println("X Զանգվածի երկարությունը = " + n);
        for (int i = 0; i < n; i = i + 1) {
            if (x[i] > 'h') {
                System.out.println(x[i]);
                count = count + 1;
                indexsum=indexsum+i;
            }
        }
        System.out.println("Արդյունքը = " + (indexsum/count));
    }
}
