package hhertevtsyan.lesson05;

import java.util.Random;

public class App_436 {
    private final static Random gen = new Random();
    public static void main(String[] args) {
        int m = 5;
        double array[][] = new double[m][m];
        randFill(array, m, m);
        showArray(array,m,m);
        double sum=0;
        int count=0;
        double a=-18.4;
        double b=24.3;
        for (int i =0; i<m; i++) {
            for (int k= 0; k<m; k++) {
                if (k<i && array[i][k] >= a && array[i][k] <= b) {
                    sum = sum +array[i][k];
                    count=count+1;
                }
            }
        }
        System.out.println(sum/count);
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
