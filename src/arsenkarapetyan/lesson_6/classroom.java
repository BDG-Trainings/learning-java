package arsenkarapetyan.lesson_6;

import java.util.Random;

public class classroom {

    public static void main(String[] args) {

        System.out.println("privet");

        final int row = 9;
        final int column = 9;
        int a = 25;
        int b = 50;
        int sum = 0;

        Random num = new Random ();
        int [][] ars = new int [row][column];

        for (int i =0 ; i < row; i++) {
            for (int k = 0; k < column; k++) {
                ars[i][k] = num.nextInt(100);
                System.out.print(ars[i][k] + "\t");
                if (ars[i][k] >= 25 && ars[i][k] <= 50){
                    sum = sum + ars[i][k];
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(a + "-ic " + b + " mijakayqi tarreri gymare havasar e: " + sum);
    }
}
