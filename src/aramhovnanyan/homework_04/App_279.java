package aramhovnanyan.homework_04;

import java.util.Arrays;

public class App_279 {

    public static void main(String[] args) {

        char[] symbols = {'A', 'v', 's', 'd', 'x', 's', 'N', 'v', 'r', 'd', 's', 'm'};
        char[] without_d = new char[symbols.length];
        int k = 0;
        int count=0;

        System.out.println(Arrays.toString(symbols));

        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] > 107) {
                without_d[k] = symbols[i];
                k++;
                count++;
            }
        }
        char[] final_array = new char[count];

        for (int i = 0; i < count; i++) {
            final_array[i] = without_d[i];
        }
        System.out.println(Arrays.toString(final_array));
    }
}
