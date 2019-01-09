package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_451 {

    public static void main(String[] args) {

        final int row = 9;
        final int column = 9;
        int sum_glx = 0;
        int sum_ozh = 0;

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

        for (int i =0 ; i < row; i++) {
            for (int k = 0; k < column; k++) {
                if (i==k){
                    sum_glx = sum_glx + ars[i][k];
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < column; k++) {
                if (i+k == row-1){
                    sum_ozh = sum_ozh + ars[i][k];
                }
            }
        }

        System.out.println("glxavor ankyunagci gymare havasar e: " + sum_glx);
        System.out.println("ozhandak ankyunagci gymare havasar e: " + sum_ozh);
    }
}
