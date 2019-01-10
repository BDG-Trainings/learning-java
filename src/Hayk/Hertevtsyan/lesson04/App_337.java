package Hayk.Hertevtsyan.lesson04;

public class App_337 {
    public static void main(String[] args) {
        int n = 26;
        int sum = 0;
        double res = 1;
        int X[] = {5, 8, -9, 14, 7, 1, 6, 1, 2, 7, 22, 21, 14, 4, 1, 78, 25, 47, 54, 1, 7, 7, 6, 11, 13, 16};
        for (int i = 1; i < n; i = i + 2) {
           sum = sum + X[i];
            }
        for (int i = 2; i < n; i = i + 2) {
            res = res*X[i];
            }
        System.out.println(res);
        if (res>0) {
            System.out.println(sum);
        } else {
            System.out.println("s=1");
        }
    }
}
