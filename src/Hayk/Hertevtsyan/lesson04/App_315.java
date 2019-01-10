package Hayk.Hertevtsyan.lesson04;

import java.util.Arrays;

public class App_315 {
    public static void main(String[] args) {
        int n = 26;
        int b = 500;
        int count = 0;
        boolean cond=false;
        int X[] = {5, 8, 9, 14, 7, 0, -6, -1, 0, 7, 22, 21, -14, 4, -1, 78, 25, 47, -54, 0, -7, 7, 6, 11, 13, -16};
        int Z[] = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            if (X[i] > b)
                cond = true;
        }
        if (cond) {
        for (int i = 0; i < n; i = i + 1) {
            if (X[i] > 0) {
                Z[count] = X[i];
                count = count + 1;
                    }
                }
            } else {
                for (int i = 0; i < n; i = i + 1) {
                    if (X[i] < 0) {
                        Z[count] = X[i];
                        count = count + 1;
                    }
                }
            }
        int Y [] = new int[count];
        for (int i =0; i<count; i=i+1) {
            Y[i]=Z[i];
        }
        System.out.println(Arrays.toString(Y));
    }
}
