package arsenkarapetyan.lesson_4;

import java.util.Arrays;

public class App_297 {

    public static void main(String[] args) {

        int[] numbers = {-4, 52, -1, 3, 4, -77, 0, 42, -86, 7, 2562, -125, 33};
        System.out.println(Arrays.toString(numbers));

        int base = 10;
        int k = 0;
        int count=0;

        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs(numbers[i])<= base){
                count++;
            }
        }

        int[] final_array = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs(numbers[i])<= base) {
                final_array[k] = numbers[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(final_array));
    }
}
