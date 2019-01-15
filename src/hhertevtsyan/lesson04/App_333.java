package hhertevtsyan.lesson04;

public class App_333 {
    public static void main(String[] args) {
        int n = 26;
        int k = 8;
        int sum = 0;
        int X[] = {5, 8, 9, 14, 7, 0, -6, -1, 0, 7, 22, 21, -14, 4, -1, 78, 25, 47, -54, 0, -7, 7, 6, 11, 13, -16};
        for (int i = 1; i < n-1; i = i + 1) {
            if (X[i - 1] + X[i + 1] < k)
                sum = sum + X[i];
        }
        System.out.println(sum);
    }
}
