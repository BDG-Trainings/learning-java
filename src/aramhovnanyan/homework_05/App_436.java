package aramhovnanyan.homework_05;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class App_436 {
    private final static Random rand = new Random();

    public static void main(String[] args) {
        final int m = 4;
        double array[][] = new double[m][m];
        int count = 0;
        double sum = 0;
        final int a = 15;
        final int b = 50;
        fillArray(array, m, m, 0, 100);

        for(int i = 0; i < array.length; i ++) {
            for (int j = 0; j  < array.length - 1 - i; j++) {
                if (array[i][j] >= a && array[i][j] <= b) {
                    count++;
                    sum+= array[i][j];
                }
            }
        }
        System.out.println("---------------");
        if (count > 0) {
            double x = sum/(double)count;
            System.out.println("Պահանջվող արժեքն է " + x);
        } else {
            System.out.println("Քանի որ փնտրվող թվերի քանակը հավասար է 0-ի, հետևաբար, պահանջվող արժեքը ևս հավասար է 0");
        }
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
