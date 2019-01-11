package Hayk.Hertevtsyan.lesson05;

import java.util.Arrays;
import java.util.Random;

public class App_458 {
    private final static Random gen = new Random();

    public static void main(String[] args) {
        int m = 5;
        int count = 0;
        int b = 18;
        int array[][] = new int[m][m];
        randFill(array, m, m);
        showArray(array, m, m);
        int B[] = new int[m];
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < m; k++) {
                if (Math.abs(array[i][k]) > b) {
                    count=count+1;
                }
            }
            B[i] = count;
            count=0;
        }
        System.out.println();
        System.out.println(Arrays.toString(B));
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
