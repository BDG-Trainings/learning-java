package arsenkarapetyan.lesson_5;

import java.math.BigDecimal;
import java.util.Random;

public class App_437 {

    public static void main(String[] args) {

        final int row = 9;
        final int column = 9;
        float sum = 0;
        float a = 5.4f;
        float b = 15.3f;
        int count = 0;

        Random num = new Random ();
        float [][] ars = new float [row][column];

        for (int i =0 ; i < row; i++) {
            for (int k = 0; k < column; k++) {
                ars[i][k] = precision(1, num.nextFloat()*100);
                System.out.print(ars[i][k] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < row; i++){
            for(int k = 0; k <= i; k++) {
                    System.out.print(ars[i][k] + "\t");
                    if (ars[i][k]*100%100 == 0) {
                        sum=sum+ars[i][k];
                        count++;
                }
            }
            System.out.println();
        }
        System.out.println();
        if (count != 0) {
            System.out.println("amboxch tveri mijin tvabanakane havasar e: " + sum / count);
        }
        if (count == 0){
            System.out.println("amboxch tiv chka");
        }

    }
    public static Float precision(int decimalPlace, Float d) {

        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }
}
