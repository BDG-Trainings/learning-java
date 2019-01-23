package aramhovnanyan.homework_04;

import java.util.Arrays;

public class App_316 {

    public static void main(String[] args) {

        int[] numbers = {-4, 52, -1, 3, 4, -77, 0, 42, -86, 7, 256, -125, 33};
        System.out.println(Arrays.toString(numbers));

        int max = 0;
        int min = 0;
        int count = 0;
        int k=0;
        int average =0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers [i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers [i];
            }
        }

        average = (max + min)/2;
        System.out.println(average);

        for (int i = 0; i < numbers.length; i++) {
            if(Math.abs(numbers[i]) < average ){
                count++;
            }
        }

        int[] final_array = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            if(Math.abs(numbers[i]) < average ){
                final_array[k] = numbers[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(final_array));
    }
}
