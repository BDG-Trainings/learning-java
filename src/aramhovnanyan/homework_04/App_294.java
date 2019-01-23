package aramhovnanyan.homework_04;

import java.util.Arrays;

public class App_294 {

    public static void main(String[] args) {

        int[] numbers = {-4, 55, -1, 3, 4, -77, 0, 43, -86, 7, 2567, -125, 33};

        int k = 0;
        int count=0;

        System.out.println(Arrays.toString(numbers));

        if (numbers.length%2==0) {
            count = numbers.length/2;
        } else {
            count = numbers.length/2 + 1;
        }

        int[] final_array = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            if (i%2==0) {
                final_array[k] = numbers[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(final_array));
    }
}
