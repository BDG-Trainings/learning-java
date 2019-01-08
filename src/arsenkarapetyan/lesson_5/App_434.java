package arsenkarapetyan.lesson_5;

import java.math.BigDecimal;
import java.util.Random;

public class App_434 {

    public static void main(String[] args) {

        final int row = 9;
        final int column = 9;
        float sum = 0;
        float a = 5.4f;
        float b = 15.3f;

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
            for(int k = 0; k < column; k++) {
                if (k > column-i-2){
                    System.out.print(ars[i][k] + "\t");
                    if (Math.abs(ars[i][k])>= a && Math.abs(ars[i][k]) <= b) {
                        sum=sum+ars[i][k];
                    }
                }
                else {
                    System.out.print("\t\t");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(a + "-ic " + b + " mijakayqym gymare havasar e: " + sum);

    }
    public static Float precision(int decimalPlace, Float d) {

        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }
}
