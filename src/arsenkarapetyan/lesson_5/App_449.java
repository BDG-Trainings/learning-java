package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_449 {

    public static void main(String[] args) {

        final int row = 9;
        final int column = 9;
        int sum = 0;

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

        for (int i = 0; i < row; i++){
            for (int k = 0; k < column - i-1; k++) {
                System.out.print(ars[i][k] + "\t");
                if (ars[i][k]%4 == 0){
                    sum = sum+ars[i][k];
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("ozhandak ankyunagcic verev 4-in bazmapatik tveri gymare havasar e: " + sum);
    }
}
