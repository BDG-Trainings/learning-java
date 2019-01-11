package ArmenIskandaryan.Lesson_05;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class App_442 {
    private final static Random rand = new Random();

    public static void main(String[] args) {
        final int m = 5;
        double array[][] = new double[m][m];
        int count = 0;
        double sum = 0;
        fillArray(array, m, m, 0, 100);

        for(int i = 0; i < array.length - 1; i ++) {
            for (int j = 0; j < i; j++) {
                if (array[i][j] < 0) {
                    count++;
                    sum += array[i][j];
                }
            }
        }
        System.out.println("---------------");
        if (count > 0) {
            double x = sum/count;
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
