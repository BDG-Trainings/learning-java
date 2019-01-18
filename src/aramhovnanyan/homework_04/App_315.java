package aramhovnanyan.homework_04;

import java.util.Arrays;

public class App_315 {

    public static void main(String[] args) {

        int[] numbers = {-4, 52, -1, 3, 4, -77, 0, 42, -86, 7, 2562, -125, 33};
        System.out.println(Arrays.toString(numbers));
        int count = 0;
        int k = 0;
        int b = -11111;
        boolean t = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < b){
                t = true;
            }
        }

        if (t == true){

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    count++;
                }
            }

            int[] final_array = new int[count];

            for (int m = 0; m < numbers.length; m++) {
                if (numbers[m] > 0) {
                    final_array[k] = numbers[m];
                    k++;
                }
            }
            System.out.println(Arrays.toString(final_array));
        }

        else {

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 0) {
                    count++;
                }
            }
            int[] final_array = new int[count];

            for (int m = 0; m < numbers.length; m++) {
                if (numbers[m] < 0) {
                    final_array[k] = numbers[m];
                    k++;
                }
            }
            System.out.println(Arrays.toString(final_array));
        }
    }
}
