package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_481 {

    public static void main(String[] args) {

        int a = 9;
        final int row = a;
        final int column = a;
        int max = 0;
        int min = 0;

        Random num = new Random ();
        int [][] ars = new int [row][column];

        for (int i =0 ; i < row; i++) {
            for (int k = 0; k < column; k++) {
                ars[i][k] = num.nextInt(100);
                System.out.print(ars[i][k] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
