package arsenkarapetyan.lesson_5;

import java.math.BigDecimal;
import java.util.Random;

public class App_438 {

    public static void main(String[] args) {

        final int row = 9;
        final int column = 9;
        int count = 0;

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
            for(int k = 0; k < i; k++) {
                System.out.print(ars[i][k] + "\t");
                if (k%2 ==0 && ars[i][k]>0) {
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("zuyq hamarov syunerym drakan tarreri qanake havasar e: " + count);

    }
    public static Float precision(int decimalPlace, Float d) {

        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }

}
