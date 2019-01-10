package ArmenIskandaryan.Lesson_05;

import java.util.Random;

public class App_426 {
    private final static Random rand = new Random();

    public static void main(String[] args) {
        final int m = 3;
        int array[][] = new int[m][m];
        fillArray(array, m, m);
        int sum = 0;

        for(int i = 0; i < array.length - 1; i ++) {
            for (int j = 0; j  < array.length - i - 1; j++) {
                if (array[i][j] % 2 == 0) {
                    sum++;
                }
            }
        }

        if (sum > 0) {
            System.out.println("Պահանջվող արժեքն է " + sum);
        } else {
            System.out.println("Քանի որ փնտրվող թվերի քանակը հավասար է 0-ի, հետևաբար, պահանջվող արժեքը ևս հավասար է 0");
        }

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
