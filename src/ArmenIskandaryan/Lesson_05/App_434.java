package ArmenIskandaryan.Lesson_05;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class App_434 {
    private final static Random rand = new Random();

    public static void main(String[] args) {
        final int m = 4;
        double array[][] = new double[m][m];
        int count = 0;
        final int a = 25;
        final int b = 50;
        fillArray(array, m, m, 0, 100);

        for(int i = 0; i < array.length; i ++) {
            for (int j = array.length - 1 - i; j  < array.length; j++) {
                if (array[i][j] >= a && array[i][j] <= b) {
                    count++;
                }
            }
        }
        System.out.println("---------------");
        System.out.println("Պահանջվող արժեքն է " + count);
    }

    private static void fillArray(double[][] array, final int row, final int col, final double left, final double right){
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                array[i][k] = left + rand.nextDouble() * (right - left);
            }
        }
        displayArray(array, row, col);
    }

    private static void displayArray(final double[][] array, final int row, final int col) {
        NumberFormat nf = new DecimalFormat("#0.0");
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                System.out.print(nf.format(array[i][k]) + ", ");
            }
            System.out.println();
        }
    }

}
