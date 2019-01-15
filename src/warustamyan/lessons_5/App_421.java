package warustamyan.lessons_5;


import java.util.Random;

public class App_421 {

    private final static Random rand = new Random();

    public static void main(String[] args) {

        final int m = 5;
        int number = 10;

        int array[][] = new int[m][m];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int k = 0; k < m; k++) {
                array[i][k] = rand.nextInt(100);
            }
        }
        displayArray(array, m, m);


        System.out.println("-------");

        for (int i = 0; i < m; i++) {
            for (int k = 0; k <= i; k++) {
                if (i == k) {

                    System.out.print(array[i][k] + ", ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            for (int k = 0; k < i; k++) {

                if (array[i][k] % number == 0) {
                    count++;
                }
            }
        }

        System.out.println("Count : " + count);

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
