package aramhovnanyan.homework_04;

import java.util.Arrays;

public class App_298 {

    public static void main(String[] args) {

        int[] numbers = {-4, 52, -1, 3, 4, -77, 0, 42, -86, 7, 2562, -125, 33};
        System.out.println(Arrays.toString(numbers));

        int k = 0;
        int count=0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 != 0){
                count++;
            }
        }

        int[] final_array = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 != 0) {
                final_array[k] = numbers[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(final_array));
    }
}
