package SPapoyan.lessons_05;
import java.util.Random;
public class App {
    private static Random H = new Random();
    public static void main(String[] args) {
        int m = 5;
        int number = 10;
        int count = 0;
        int arr[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < m; k++) {
                arr[i][k] = H.nextInt(100);
                System.out.print(arr[i][k] + ",");
            }
            System.out.println();
        }
        System.out.print("---------------");
        for (int i = 0; i < m; i++) {
            for (int k = 0; k <= i; k++) {
                if (i > k) {
                    System.out.print(arr[i][k] + ", ");
                }
            }
            System.out.println();
        }
        System.out.println("---------------");
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < m; k++) {
                if (arr [i][k]% number == 0 && i>k) {
                    count++;

                }
            }

        } System.out.println("Count = " + count);

    }
}



