package hhertevtsyan.lesson05;

import java.util.Arrays;
import java.util.Random;

public class App_462 {
    private final static Random gen = new Random();
    public static void main(String[] args) {
        int m = 5;
        int count = 0;
        int array[][] = new int[m][m];
        randFill(array, m, m);
        showArray(array, m, m);
        int X[] = new int[m];
        for (int i = 0; i < m; i++) {
            if (array[i][i] == 0) {
                for (int k = 0; k < m; k++) {
                    X[count]=array[i][k];
                    count=count+1;
                }
            }
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
