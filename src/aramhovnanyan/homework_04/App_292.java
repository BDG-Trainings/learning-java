package aramhovnanyan.homework_04;

import java.util.Arrays;

public class App_292 {

    public static void main(String[] args) {

        int[] numbers = {-4, 55, -1, 3, 4, -77, 0, 43, -86, 7, 2567, -125};

        int k = 0;
        int count=0;

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%7 != 0) {
                count++;
            }
        }

        int[] final_array = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%7 != 0) {
                final_array[k] = numbers[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(final_array));
    }
}
