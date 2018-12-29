package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_370 {

    public static void main(String[] args) {

        System.err.println(System.currentTimeMillis());

        Random num = new Random ();
        final int row = 5;
        final int column = 5;
        int [][] array = new int [row][column];

        for (int i=0; i<row; i++){
            for (int k = 0; k<row; k++){
                int a = (num.nextInt(90) + 10);
                array[i][k]=a;
                System.err.print(array[i][k]+ "\t");
            }System.err.println();
        }
    }
}
