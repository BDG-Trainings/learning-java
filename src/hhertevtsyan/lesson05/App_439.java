package hhertevtsyan.lesson05;

import java.util.Random;

public class App_439 {
    private final static Random gen = new Random();
    public static void main(String[] args) {
        int m = 5;
        double array[][] = new double[m][m];
        randFill(array, m, m);
        showArray(array,m,m);
        double res=1;
        for (int i =0; i<m; i++) {
            for (int k= 0; k<m; k++) {
                if (k>i && (i+k)%2 != 0) {
                    res = res * array[i][k];
                }
            }
        }
        System.out.println(res);
    }

    // կիրառվող մեթոդներ՝
    private static void showArray (double array [] [], final int row, final int col) {
        for (int i=0; i<row; i++) {
            for (int k=0; k<col; k++) {
                System.out.print(array [i][k] + ", ");
            }
            System.out.println();
        }
    }
    private static void randFill (double array [] [], final int row, final int col) {
        for (int i=0; i<row; i++){
            for (int k=0; k<col; k++) {
                array[i][k] = gen.nextDouble()*100-90;
            }
        }
    }
}
