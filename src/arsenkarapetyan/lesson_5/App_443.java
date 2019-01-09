package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_443 {

    public static void main(String[] args) {

        Random num = new Random ();
        final int row = 11;
        final int column = 11;
        int count = 0;
        int [][] ars = new int [row][column];

        for (int i=0; i<row; i++){
            for (int k = 0; k<column; k++){
                ars[i][k] = (num.nextInt(10));
                System.out.print(ars[i][k]+ "\t");
            }System.out.println();
        }
        System.out.println();

        for (int i= 0; i < row; i++){
            for (int k = 0; k < column; k++){
                if (k > i){
                    System.out.print(ars[i][k] + "\t");
                    if(ars[i][k] == 0){
                        count++;
                    }
                }
                else {
                    System.out.print("\t");
                }
            }System.out.println();
        }
         System.out.println("0 arzheq unecogh tarreri qanake:  " + count);
    }
}
