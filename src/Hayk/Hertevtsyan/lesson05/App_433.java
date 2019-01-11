package Hayk.Hertevtsyan.lesson05;

import java.util.Random;

public class App_433 {
    private final static Random gen = new Random();

    public static void main(String[] args) {
        int m = 5;
        int array[][] = new int[m][m];
        randFill(array, m, m);
        showArray(array,m,m);
        int count=0;
        int a=16;
        int b=58;
        for (int i =0; i<m; i++) {
            for (int k= 0; k<m; k++) {
                if (k+i<m-1 && array[i][k]>=a && array[i][k] <=b) {
                    count = count +1;
                }
            }
        }
        System.out.println(count);
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
                array[i][k] = gen.nextInt(100);
            }
        }
    }
}
