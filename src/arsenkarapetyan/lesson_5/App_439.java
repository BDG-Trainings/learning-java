package arsenkarapetyan.lesson_5;

import java.math.BigDecimal;
import java.util.Random;

public class App_439 {
    public static void main(String[] args) {

        final int row = 9;
        final int column = 9;
        double art = 1;

        Random num = new Random ();
        float [][] ars = new float [row][column];

        for (int i =0 ; i < row; i++) {
            for (int k = 0; k < column; k++) {
                ars[i][k] = precision(2, num.nextFloat()*10-5);
                System.out.print(ars[i][k] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < row; i++){
            for(int k = 0; k < column; k++) {
                if (k > i){
                    System.out.print(ars[i][k] + "\t");
                    if ((i+k)%2 != 0){
                        art=art*ars[i][k];
                    }
                }
                else {
                    System.out.print("\t\t");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("artadryale havasar e: " + art);

    }
    public static Float precision(int decimalPlace, Float d) {

        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }
}
