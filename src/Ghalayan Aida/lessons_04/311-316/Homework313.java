package lessons_04;

public class Homework313 {
    public static void main(String[] args) {
        int n = 6;
        int X[] = {1, 15, -8, 6, 5, -9};
        int Y[] = new int[n];
        int i = 1;
        int j = 0;
        while (i < (n - 1)) {
            Y[j] = X[i + 1];
            Y[j + 1] = X[i];
            j = j + 2;
            i = i + 2;
        }
        j = 0;
        while (j < n) {
            System.out.println(Y[j]);
            j++;
        }
    }
}


