package aramhovnanyan.homework_04;

import java.util.Arrays;

public class App_295 {

    public static void main(String[] args) {

        int[] numbers = {-4, 55, -1, 3, 4, -77, 0, 43, -86, 7, 2567, -125, 33};
        System.out.println(Arrays.toString(numbers));

        int k = 0;
        int count=0;

        int[] final_array = new int[numbers.length/2];

        for (int i = 0; i < numbers.length; i++) {
            if (i%2!=0) {
                final_array[k] = numbers[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(final_array));
    }
}
