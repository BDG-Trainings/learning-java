package arsenkarapetyan.lesson_5;

import java.math.BigDecimal;
import java.util.Random;

public class App_435 {

    public static void main(String[] args) {

        final int row = 9;
        final int column = 9;
        int count = 0;
        int amboghj = 0;

        Random num = new Random ();
        float [][] ars = new float [row][column];

        for (int i =0 ; i < row; i++) {
            for (int k = 0; k < column; k++) {
                ars[i][k] = precision(2, num.nextFloat()*100-50);
                System.out.print(ars[i][k] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < row; i++){
            for (int k = 0; k < column - i-1; k++) {
                amboghj = (int) ars[i][k];
                System.out.print(amboghj + "\t\t");
                if (amboghj%5 == 0 && amboghj != 0){
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("ozhandak ankyunagcic verev amboxch masov 5-in bazmapatik tveri qanakn e: " + count);
    }
    public static Float precision(int decimalPlace, Float d) {

        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }
}
