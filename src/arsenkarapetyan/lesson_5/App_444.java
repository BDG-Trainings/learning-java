package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_444 {

    public static void main(String[] args) {

        Random num = new Random ();
        final int row = 11;
        final int column = 11;
        int count = 0;
        int [][] ars = new int [row][column];

        for (int i=0; i<row; i++){
            for (int k = 0; k<column; k++){
                ars[i][k] = (num.nextInt(100)-50);
                System.out.print(ars[i][k]+ "\t");
            }System.out.println();
        }
        System.out.println();

        for (int i= 0; i < row; i++){
            for (int k = 0; k < column; k++){
                if (k > i){
                    System.out.print(ars[i][k] + "\t");
                    if(i%2 != 0 && ars[i][k] < 0){
                        count++;
                    }
                }
                else {
                    System.out.print("\t");
                }
            }System.out.println();
        }
        System.out.println("kent togheri vra gtnvogh bacasakan tarreri qanake:  " + count + " e.");
    }
}
