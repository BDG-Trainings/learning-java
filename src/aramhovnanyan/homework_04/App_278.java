package aramhovnanyan.homework_04;

import java.util.Arrays;

public class App_278 {

    public static void main(String[] args) {

        char[] symbols = {'A', 'v', 's', 'd', 'x', 's', 'N', 'v', 'r', 'd', 's', 'm'};
        char[] final_array = new char[symbols.length/2];
        int k = 0;

        System.out.println(Arrays.toString(symbols));

        for (int i = 0; i < symbols.length; i++) {
            if (i%2 != 0) {
                final_array[k] = symbols[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(final_array));
    }
}
