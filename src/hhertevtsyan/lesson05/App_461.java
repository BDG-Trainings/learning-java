package hhertevtsyan.lesson05;

import java.util.Arrays;
import java.util.Random;

public class App_461 {
    private final static Random gen = new Random();
    public static void main(String[] args) {
        int m = 5;
        int count = 0;
        int a =300;
        int b = 1700;
        int array[][] = new int[m][m];
        randFill(array, m, m);
        showArray(array, m, m);
        int Y[] = new int[m*m];
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < m; k++) {
                if (array[i][k]*array[i][k] >=a &&  array[i][k]*array[i][k] <=b) {
                    Y[count]=array[i][k];
                    count=count+1;
                }
            }
        }
        int X[] = new int [count];
        for (int i=0; i<count; i++) {
            X[i]=Y[i];
        }
        System.out.println();
        System.out.println(Arrays.toString(X));
    }

    // կիրառվող մեթոդներ՝
    private static void showArray ( int array[][], final int row, final int col){
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                System.out.print(array[i][k] + ", ");
            }
            System.out.println();
        }
    }
    private static void randFill ( int array[][], final int row, final int col){
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                array[i][k] = gen.nextInt(200) - 100;
            }
        }
    }
}
