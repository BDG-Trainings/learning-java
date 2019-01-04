package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_428 {

    public static void main(String[] args) {

        final int row = 9;
        final int column = 9;
        int b = 1;
        int count = 0;

        Random num = new Random ();
        int [][] ars = new int [row][column];

        for (int i =0 ; i < row; i++) {
            for (int k = 0; k < column; k++) {

                ars[i][k] = (num.nextInt(10));
                System.out.print(ars[i][k] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < row; i++){
            for(int k = 0; k <= column-b; k++) {
                System.out.print(ars[i][k] + "\t");
                if (ars[i][k] == 0) {
                    count++;
                }
            }
            b++;
            System.out.println();
        }
        System.out.println("ozhandak ankyunagci kam verev gtnvogh 0 arzheq ynecogh tarreri qanakn e: " + count);
    }
}
