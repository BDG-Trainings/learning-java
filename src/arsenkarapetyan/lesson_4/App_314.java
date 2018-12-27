package arsenkarapetyan.lesson_4;

import java.util.Arrays;

public class App_314 {

    public static void main(String[] args) {

        int[] numbers = {-4, 52, -1, 3, 4, -77, 0, 42, -86, 7, 2562, -125, 33};
        System.out.println(Arrays.toString(numbers));
        int count = 0;
        int k=0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0){
                count++;
            }
        }

        int[] final_array = new int[numbers.length + count];

        for (int i = 0; i < numbers.length; i++) {
            final_array[k] = numbers[i];
            if (numbers[i] > 0){
                k++;
                final_array[k] = 0;
            }
            k++;
        }
        System.out.println(Arrays.toString(final_array));
    }
}
