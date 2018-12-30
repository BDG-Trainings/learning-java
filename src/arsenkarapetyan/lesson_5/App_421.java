package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_421 {

    public static void main(String[] args) {

        Random num = new Random ();
        final int row = 7;
        final int column = 7;
        int bazmapatik = 4;
        int count = 0;
        int [][] array = new int [row][column];

        for (int i=0; i<row; i++){
            for (int k = 0; k<column; k++){
                int a = (num.nextInt(100));
                array[i][k]=a;
                System.err.print(array[i][k]+ "\t");
            }System.err.println();
        }

        for (int m= 0; m < row; m++){
            for (int f = 0; f < m; f++){
                if (array[m][f]%4 == 0){
                    System.err.print(array[m][f]+ "\t");
                    count++;
                } else {
                    System.out.print(array[m][f]+ "\t");
                }
            }System.out.println();
        }

        System.out.println(bazmapatik + " bazmapatik tveri qanake;  " + count);

    }
}
