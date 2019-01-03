package arsenkarapetyan.lesson_5;

import java.util.Random;

public class App_429 {

    public static void main(String[] args) {

        final int row = 9;
        final int column = 9;
        int count = 0;
        int b = 0;

        Random num = new Random ();
        int [][] ars = new int [row][column];

        for (int i =0 ; i < row; i++) {
            for (int k = 0; k < column; k++) {

                int a = (num.nextInt(90)+10);
                ars[i][k] = a;
                System.out.print(ars[i][k] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < row; i++){
            for(int k = b; k < column; k++) {
                System.out.print(ars[i][k] + "\t");
                if (ars[i][k]%5 == 2) {
                    count++;
                }
            }
            b++;
            System.out.println();
            for (int m=b; m>0; m--){
                System.out.print("\t");
            }
        }
        System.out.println();
        System.out.println("glxavor ankyunagci kam verev gtnvogh tarreri qanake voronq 5 bazhanelis kmna 2 mnacord:" + count);
    }
}
