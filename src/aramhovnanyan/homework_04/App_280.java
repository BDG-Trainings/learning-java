package aramhovnanyan.homework_04;

import java.util.Arrays;

public class App_280 {

    public static void main(String[] args) {

        char[] symbols = {'A', 'v', 's', 'f', 'x', 's', 'N', 'v', 'f', 'd', 's', 'f'};
        char[] with_f = new char[symbols.length*2];
        int k = 0;
        int count=0;

        System.out.println(Arrays.toString(symbols));

        for (int i = 0; i < symbols.length; i++) {
            with_f[k] = symbols[i];
            k++;
            if (symbols[i] == 102) {
                with_f[k] = 'f';
                count++;
                k++;
            }
        }
        char[] final_array = new char[symbols.length+count];

        for (int i = 0; i < symbols.length+count; i++) {
            final_array[i] = with_f[i];
        }
        System.out.println(Arrays.toString(final_array));
    }
}
