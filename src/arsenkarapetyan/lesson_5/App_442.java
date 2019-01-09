package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_442 {

    public static void main(String[] args) {

        Random num = new Random ();
        final int row = 11;
        final int column = 11;
        int sum = 0;
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
            for (int k = 0; k < column-i-1; k++){
                    System.out.print(ars[i][k] + "\t");
                    if(ars[i][k] < 0){
                        sum = sum + ars[i][k];
                        count++;
                }
            }System.out.println();
        }
        if (count >0) {
            System.out.println("bacasakan tveri mijin tvabanakane;  " + sum / count);
        }
        else {
            System.out.println("chka bacasakan tiv");
        }
    }
}
