package aramhovnanyan.homework_04;

import java.util.Arrays;

public class App_312 {

    public static void main(String[] args) {

        int[] numbers = {-4, 52, -1, 3, 4, -77, 0, 42, -86, 7, 2562, -125, 33};
        System.out.println(Arrays.toString(numbers));

        int k = 0;

        int[] final_array = new int[numbers.length-1];

        for (int i = 0; i < numbers.length-1; i++) {
            if (Math.abs(numbers[i]) > Math.abs(numbers[i+1])) {
                final_array[k] = numbers[i];
            } else {
                final_array[k] = numbers[i+1];
            }
            k++;
        }
        System.out.println(Arrays.toString(final_array));
    }
}