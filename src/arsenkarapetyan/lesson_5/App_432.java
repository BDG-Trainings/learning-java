package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_432 {

    public static void main(String[] args) {
        final int row = 9;
        final int column = 9;
        int count = 0;
        double sum = 0;

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
            for (int k = 0; k < column - i; k++){
                System.out.print(ars[i][k] + "\t");
                if ((i+k)%2 != 0){
                    double a = ars[i][k];
                    sum = sum + Math.pow(a,2);
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("ozhandak ankyunagci vra ev verev kent indexnerov tarreri mijin qarakusayine: " + sum/count);
    }
}
