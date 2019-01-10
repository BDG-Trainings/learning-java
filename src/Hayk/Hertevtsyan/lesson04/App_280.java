package Hayk.Hertevtsyan.lesson04;

import java.util.Arrays;

public class App_280 {
    public static void main(String[] args) {
        int n = 26;
        int count = 0;
        char x[] = {'b', 'r', 'b', 'f', 'd', 'b', 'b', 'b', 'b', 'a', 'n', 'f', 'h', 'a', 'b', 'k', ' ', 'b', 'a', 'd', 'h', 'a', 'd', 'a', 'b', 'b'};
        char y[] = new char[2*n];
//        System.out.println("X Զանգվածի երկարությունը = " + n);
        for (int i = 0; i < n; i = i + 1) {
            if (x[i] == 'f') {
                y[count] = x[i];
                y[count+1]='f';
                count=count+2;
            }
        }
        char z [] = new char[count];
        for (int i =0; i<count; i=i+1) {
            z[i]=y[i];
        }
        System.out.println(Arrays.toString(z));
    }
}
