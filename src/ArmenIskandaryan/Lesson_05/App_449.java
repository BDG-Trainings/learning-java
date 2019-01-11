package ArmenIskandaryan.Lesson_05;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class App_449 {
    private final static Random rand = new Random();

    public static void main(String[] args) {
        final int m = 4;
        double array[][] = new double[m][m];
        int sum = 0;
        fillArray(array, m, m, -100, 100);

        for(int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                int tmp = (int)array[i][j];
                if (tmp % 4 == 0) {
                    sum += array[i][j];
                }
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
