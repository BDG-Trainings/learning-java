package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_452 {

    public static void main(String[] args) {

        final int row = 9;
        final int column = 9;

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
        System.out.println("arachin ev verchin tarreri qarakysineri gymare havasar e: " + (int)(Math.pow((double) ars[0][0], 2) + Math.pow((double) ars[row-1][column-1], 2)));
    }
}
