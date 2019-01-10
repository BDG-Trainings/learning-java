package warustamyan;


public class App {

    public static void main(String[] args) {
        final int rowSize = 2;
        final int colSize = 2;

        int array[][] = new int[rowSize][colSize];
        array[1][1] = 20;

        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 2; k++) {

                array[i][k] = i + k;
            }
        }
        display(array, rowSize - 1, colSize - 1);
    }

    private static void display(final int[][] array, final int rowSize, final int colSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int k = 0; k < colSize; k++) {
                System.out.print(array[i][k] + ", ");
            }
            System.out.println();
        }
    }
}
