package hhertevtsyan.lesson04;

public class App_334 {
    public static void main(String[] args) {
        int n = 26;
        int X[] = {10, 8, 7, 6, 5, 4, -6, -11, -15, -17, -22, -24, -34, -40, -1, 78, 25, 47, -54, 0, -7, 7, 6, 11, 13, -16};
        int max = 0;
        int sum = 0;
        int res = 1;
        for (int i = 1; i < n; i = i + 1) {
            if (X[i] > X[i - 1]) {
                max = i;
                i = i + n;
            }
        }
        if (max <= n / 2) {
            for (int i = 0; i < n; i = i + 1) {
                if (X[i] > 0)
                    sum = sum + X[i];
            }
            System.out.println(sum);
        } else {
            for (int i = 0; i < n; i = i + 1) {
                if (X[i] < 0)
                    res = res * X[i];
            }
            System.out.println(res);
        }
    }
}
