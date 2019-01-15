package hhertevtsyan.lesson04;

public class App_336 {
    public static void main(String[] args) {
        int n = 26;
        int s = 0;
        boolean t = false;
        int X[] = {5, 8, 9, 14, 7, 0, 6, 1, 0, 7, 22, 21, 14, 4, 1, 78, 25, 47, 54, 0, 7, 7, 6, 11, 13, 16};
        int max = X[0];
        for (int i = 0; i < n; i = i + 1) {
            if (X[i] < 0) {
                t = true;
                i = i + n;
            }
        }
        for (int i = 0; i < n; i = i + 1) {
            if (X[i] > max) {
                max = X[i];
            }
        }
        if (t) {
            System.out.println("Max=" + max);
        } else {
            System.out.println("s=0");
        }
    }
}
