package arsenkarapetyan.lesson_5;

import java.math.BigDecimal;
import java.util.Random;

public class App_450 {

    public static void main(String[] args) {

        final int row = 9;
        final int column = 9;
        float sum = 0;

        Random num = new Random ();
        float [][] ars = new float [row][column];

        for (int i =0 ; i < row; i++) {
            for (int k = 0; k < column; k++) {
                ars[i][k] = precision(2, num.nextFloat()*100);
                System.out.print(ars[i][k] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < row; i++){
            for(int k = 0; k < column; k++) {
                if (k > column-i-1){
                    System.out.print(ars[i][k] + "\t");
                    sum = sum + ars[i][k]*100%100;
                }
                else {
                    System.out.print("\t\t");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("ozhandak ankyunagcic nerqev gtnvogh tarreri arzheqneri kotorakayin maseri gymare havasar e: " + sum/100);
    }

    public static Float precision(int decimalPlace, Float d) {

        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }
}
