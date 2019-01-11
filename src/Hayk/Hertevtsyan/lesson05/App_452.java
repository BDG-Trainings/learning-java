package Hayk.Hertevtsyan.lesson05;

import java.util.Arrays;
import java.util.Random;

public class App_452 {
    private final static Random gen = new Random();
    public static void main(String[] args) {
        int m = 5;
        int array[][] = new int[m][m];
        randFill(array, m, m);
        showArray(array,m,m);
        int B [] = new int [m];
        for (int i =0; i<m; i++) {
            B[i] = array[i][0]*array[i][0] + array[i][m-1]*array[i][m-1];
            }
        System.out.println();
        System.out.println(Arrays.toString(B));
    }

    // կիրառվող մեթոդներ՝
    private static void showArray (int array [] [], final int row, final int col) {
        for (int i=0; i<row; i++) {
            for (int k=0; k<col; k++) {
                System.out.print(array [i][k] + ", ");
            }
            System.out.println();
        }
    }
    private static void randFill (int array [] [], final int row, final int col) {
        for (int i=0; i<row; i++){
            for (int k=0; k<col; k++) {
                array[i][k] = gen.nextInt(200)-100;
            }
        }
    }
}
