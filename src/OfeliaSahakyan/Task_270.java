package src.OfeliaSahakyan;

public class Task_270 {
    public static void main(String[] args) {
        int[] Array1 = {1, 1, 2, 0, 2, 3, 5};
        int[] Array2 = {1, 1, 2, 0, -2, 3, -5};
        int n = 7;

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < Array1.length; i++) {
            sum1 = sum1 + Array1[i];
        }
        for (int i = 0; i < Array2.length; i++) {
            sum2 = sum2 + Array1[i];
        }
        System.out.print(sum1 + sum2);
    }
}

