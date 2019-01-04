package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_433 {

    public static void main(String[] args) {
        final int row = 9;
        final int column = 9;
        int count = 0;
        int a = 30;
        int b = 50;

        Random num = new Random();
        int [][] ars = new int [row][column];

        for (int i =0 ; i < row; i++) {
            for (int k = 0; k < column; k++){
                ars[i][k] = (num.nextInt(90)+10);
                System.out.print(ars[i][k] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i =0 ; i < row; i++) {
            for (int k = 0; k < column - i-1; k++){
                System.out.print(ars[i][k] + "\t");
                if (a <= ars[i][k] && ars[i][k] <= b){
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println(a + " ic " + b + " mijakayqym gtnvym en: " + count);
    }
}
