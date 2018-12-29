package Hayk.Hertevtsyan.lesson04;

import java.util.Arrays;

public class App_311 {
    public static void main(String[] args) {
        int n = 26;
        int count = 0;
        int X[] = {5, 8, 9, 14, 7, 0, -6, -1, 0, 7, 22, 21, -14, 4, -1, 78, 25, 47, -54, 0, -7, 7, 6, 11, 13, -16};
        int max = X[0];
        int Z[] = new int[n];
//        System.out.println("X Զանգվածի երկարությունը = " + n);
        for (int i = 0; i < n; i = i + 1) {
            if (X[i] > max) {
                max = X[i];
            }
        }
        for (int i = 0; i < n; i = i + 1) {
            if (X[i] > 0) {
                Z[count] = X[i]+max;
                count = count + 1;
            }
        }
        int Y [] = new int[count];
        for (int i =0; i<count; i=i+1) {
            Y[i]=Z[i];
        }
        System.out.println(Arrays.toString(Y));
    }
}
