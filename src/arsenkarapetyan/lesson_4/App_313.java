package arsenkarapetyan.lesson_4;

import java.util.Arrays;

public class App_313 {

    public static void main(String[] args) {

        int[] numbers = {-4, 52, -1, 3, 4, -77, 0, 42, -86, 7, 2562, -125, 33};
        System.out.println(Arrays.toString(numbers));

        int[] final_array = new int[numbers.length];
        final_array[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if(i%2 != 0) {
                final_array[i + 1] = numbers[i];
            }
            if(i%2 == 0) {
                final_array[i - 1] = numbers[i];
            }
        }
        System.out.println(Arrays.toString(final_array));
    }
}
