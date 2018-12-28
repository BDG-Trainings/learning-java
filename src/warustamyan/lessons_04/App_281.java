package warustamyan.lessons_04;


import java.util.Arrays;

public class App_281 {

    public static void main(String[] args) {

        int array[] = {12, -13, 14, 3, 14, -5, 22, 4, -1, 54, 0, 22};

        int fakePositiveNumbers[] = new int[array.length];

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                fakePositiveNumbers[k] = array[i];
                k = k + 1;
            }
        }

        int originalPositiveNumbers[] = new int[k];
        for (int i = 0; i < k; i++) {
            originalPositiveNumbers[i] = fakePositiveNumbers[i];
        }
        System.out.println(Arrays.toString(originalPositiveNumbers));
    }
}
