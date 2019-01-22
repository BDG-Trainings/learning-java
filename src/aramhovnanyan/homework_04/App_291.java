package aramhovnanyan.homework_04;

import java.util.Arrays;

public class App_291 {

    public static void main(String[] args) {

        int[] numbers = {-4, 55, -1, 3, 4, -76, 0, 43, -86, 7, 25678, -1257};
        int [] without_positive = new int [numbers.length];

        int k = 0;
        int count=0;

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] <= 0) {
                without_positive[k] = numbers[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(without_positive));

        int[] final_array = new int[k];

        for (int i = 0; i < k; i++) {
            final_array[i] = without_positive [i];
        }
        System.out.println(Arrays.toString(final_array));
    }
}
