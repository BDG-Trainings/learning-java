package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_427 {
    public static void main(String[] args) {

        final int row = 9;
        final int column = 9;
        long art = 1;
        int b = 1;
        int bazm =5;

        Random num = new Random ();
        int [][] ars = new int [row][column];

        for (int i =0 ; i < row; i++) {
            for (int k = 0; k < column; k++) {

                int a = (num.nextInt(90) + 10);
                ars[i][k] = a;
                System.out.print(ars[i][k] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < row; i++){
            for(int k = 0; k <= column-b; k++) {
                System.out.print(ars[i][k] + "\t");
                if (ars[i][k] % bazm == 0) {
                    art = art * ars[i][k];
                }
            }
            b++;
            System.out.println();
        }
        System.out.println("ozhandak ankyunagci kam verev gtnvogh " + bazm + " bazmapatik tveri artadryale havasar e: " + art);
    }
}
