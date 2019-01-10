package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_445 {

    public static void main(String[] args) {

        Random num = new Random ();
        final int row = 11;
        final int column = 11;
        int count = 0;
        int a = 25;
        int [][] ars = new int [row][column];

        for (int i=0; i<row; i++){
            for (int k = 0; k<column; k++){
                ars[i][k] = (num.nextInt(100)-50);
                System.out.print(ars[i][k]+ "\t");
            }System.out.println();
        }
        System.out.println();

        for (int i= 0; i < row; i++){
            for (int k = 0; k < i; k++){
                System.out.print(ars[i][k] + "\t");
                    if(Math.abs(ars[i][k])>a){
                        count++;
                    }
            }System.out.println();
        }
        System.out.println();
        System.out.println(a + "-ic bacarzak arzheqov mec en: " + count + " tarrere");
    }
}
