package ArmenIskandaryan.Lesson_05;

import java.util.Random;

public class App_433 {
    private final static Random rand = new Random();

    public static void main(String[] args) {
        final int m = 4;
        int array[][] = new int[m][m];
        fillArray(array, m, m);
        int count = 0;
        final int a = 25;
        final int b = 50;

        for(int i = 0; i < array.length - 1; i ++) {
            for (int j = 0; j  < array.length - i - 1; j++) {
                if (array[i][j] >= a && array[i][j] <= b) {
                    count++;
                }
            }
        }
        System.out.println("---------------");
        System.out.println("Պահանջվող արժեքն է " + count);
    }

    private static void fillArray(int[][] array, final int row, final int col){

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                array[i][k] = rand.nextInt(100);
            }
        }
        displayArray(array, row, col);
    }

    private static void displayArray(final int[][] array, final int row, final int col) {
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                System.out.print(array[i][k] + ", ");
            }
            System.out.println();
        }
    }

}
