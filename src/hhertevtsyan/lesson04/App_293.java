package hhertevtsyan.lesson04;

import java.util.Arrays;

public class App_293 {
    public static void main(String[] args) {
        int n = 26;
        int a = -9;
        int b = 14;
        int count = 0;
        int X[] = {5, 8, 9, 14, 7, 0, -6, -1, 0, 7, 22, 21, -14, 4, -1, 78, 25, 47, -54, 0, -7, 7, 6, 11, 13, -16};
        int Z[] = new int[n];
//        System.out.println("X Զանգվածի երկարությունը = " + n);
        for (int i = 0; i < n; i = i + 1) {
            if (X[i] >= a && X[i] <= b) {
            } else {
                Z[count] = X[i];
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
