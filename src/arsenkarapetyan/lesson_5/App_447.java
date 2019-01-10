package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_447 {

    public static void main(String[] args) {

        Random num = new Random ();
        final int row = 11;
        final int column = 11;
        long bazm = 1;
        int b = 10;
        int [][] ars = new int [row][column];

        for (int i=0; i<row; i++){
            for (int k = 0; k<column; k++){
                ars[i][k] = (num.nextInt(100));
                System.out.print(ars[i][k]+ "\t");
            }System.out.println();
        }
        System.out.println();

        for (int i= 0; i < row; i++){
            for (int k = 0; k < column; k++){
                if (k >= column - i -1){
                    System.out.print(ars[i][k] + "\t");
                    if (ars[i][k] < b && ars[i][k] != 0){
                        bazm = bazm * ars[i][k];
                    }
                }
                else {
                    System.out.print("\t");
                }
            }System.out.println();
        }
        System.out.println(b + "-ic poqr tveri artadryale havasar e: " + bazm);
    }
}
