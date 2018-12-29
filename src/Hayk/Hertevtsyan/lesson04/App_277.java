package Hayk.Hertevtsyan.lesson04;

import java.util.Arrays;

public class App_277 {
    public static void main(String[] args) {
        int n = 26;
        int count = 0;
        char x[] = {'b', 'r', 'b', 't', 'd', 'b', 'b', 'b', 'b', 'a', 'n', 'd', 'h', 'a', 'b', 'k', ' ', 'b', 'a', 'd', 'h', 'a', 'd', 'a', 'b', 'b'};
        char y[] = new char[n];
//        System.out.println("X Զանգվածի երկարությունը = " + n);
        for (int i = 0; i < n; i = i + 1) {
            if (x[i] != 'd') {
                y[count] = x[i];
                count=count+1;
            }
        }
        char z [] = new char[count];
        for (int i =0; i<count; i=i+1) {
            z[i]=y[i];
        }
        System.out.println(Arrays.toString(z));
    }
}
