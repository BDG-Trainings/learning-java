package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_426 {

    public static void main(String[] args) {

        final int row = 9;
        final int column = 9;
        int sum = 0;
        int b = 1;

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
            for(int k = 0; k < column-b; k++) {
                System.out.print(ars[i][k] + "\t");
                if (ars[i][k] % 2 == 0) {
                    sum = sum + ars[i][k];
                }
            }
            b++;
            System.out.println();
        }
        System.out.println("ozhandak ankyunagcic verev gtnvogh zuyg tarreri gumare havasar e: " + sum);
    }
}
