package aramhovnanyan.homework_05;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class App_450 {
    private final static Random rand = new Random();

    public static void main(String[] args) {
        final int m = 3;
        double array[][] = new double[m][m];
        double sum = 0;
        fillArray(array, m, m, 0, 100);

        for(int i = 1; i < array.length; i++) {
            for (int j = array.length - i; j < array.length; j++) {
                int tmp = (int)array[i][j];
                sum += array[i][j] - tmp;
            }
        }
        System.out.println("---------------");
        System.out.println("Պահանջվող արժեքն է " + sum);
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
                System.out.print(nf.format(array[i][k]) + "\t");
            }
            System.out.println();
        }
    }

}
