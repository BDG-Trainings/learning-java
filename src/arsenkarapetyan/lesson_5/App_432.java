package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_432 {

    public static void main(String[] args) {
        final int row = 9;
        final int column = 9;
        int count = 0;

        Random num = new Random();
        int [][] ars = new int [row][column];

        for (int i =0 ; i < row; i++) {
            for (int k = 0; k < column; k++){
                ars[i][k] = (num.nextInt(90)+10);
                System.out.print(ars[i][k] + "\t");
            }
            System.out.println();
        }
    }
}
