package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_461 {

    public static void main(String[] args) {

        final int row = 9;
        final int column = 9;
        int a = 50;
        int b = 300;
        int c= 0;
        int count = 0;

        Random num = new Random ();
        int [][] ars = new int [row][column];

        for (int i =0 ; i < row; i++) {
            for (int k = 0; k < column; k++) {
                ars[i][k] = num.nextInt(100);
                System.out.print(ars[i][k] + "\t");
                if (Math.pow((double)ars[i][k],2) >= a && Math.pow((double)ars[i][k],2) <= b){
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println();

        int [] fin = new int [count];

        for (int i =0 ; i < row; i++) {
            for (int k = 0; k < column; k++) {
                if (Math.pow((double)ars[i][k],2) >= a && Math.pow((double)ars[i][k],2) <= b){
                    fin[c] = ars[i][k];
                    System.out.print(fin[c] + ",\t");
                    c++;
                }
            }
        }
    }
}
