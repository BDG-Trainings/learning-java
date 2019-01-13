package SPapoyan.lessons_05;

import java.util.Random;

public class App {
    private static Random H = new Random();

    public static void main(String[] args) {
        int m = 5;
        int arr [][] = new int [m][m];
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < m; k++) {
                arr[i][k] = H.nextInt(100);
                System.out.print(arr[i][k] + ",");

            }
            System.out.println();
        }
        System.out.println("---------------");
    }

}


