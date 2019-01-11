package Hayk.Hertevtsyan.lesson05;

import java.util.Random;

public class App_471 {
    private final static Random gen = new Random();
    public static void main(String[] args) {
        int m = 5;
        int array[][] = new int[m][m];
        randFill(array, m, m);
        showArray(array, m, m);
        int min = array[0][0];
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < m; k++) {
                if (i >= k && array[i][k] < min) {
                    min = array[i][k];
                }
            }
        }
        System.out.println();
        System.out.println(min);
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
