package hhertevtsyan.lesson04;

import java.util.Arrays;

public class App_335 {
    public static void main(String[] args) {
        int n = 26;
        int count = 0;
        int index = 0;
        int X[] = {5, 8, 9, 14, 7, 0, -6, -1, 0, 7, 22, 21, -14, 4, -1, 78, 25, 47, -54, 0, -7, 7, 6, 11, 13, -16};
        int Y[] = new int [n];
        for (int i = 1; i < n-1; i = i + 1) {
            Y[count] = X[i - 1] + X[i + 1];
            count = count + 1;
        }
        int max = Y[0];
        for (int i = 0; i < count; i = i +1) {
            if (Y[i] > max) {
                max = Y[i];
                index = i;
            }
        }
//        System.out.println(Arrays.toString(Y));
        System.out.println("Index=" + (index+1));
        System.out.println("value=" + max );
    }
}
