package hhertevtsyan.lesson04;

public class App_271 {
    public static void main(String[] args){
        int n = 26;
        int count=0;
        char x [] = {'h','e','r','t','e','v','t','s','y','a','n',' ', 'h', 'a', 'y', 'k', ' ', 'v', 'a', 'c', 'h', 'a', 'g', 'a', 'n', 'i'};
//        System.out.println("X Զանգվածի երկարությունը = " + n);
        for (int i=0; i < n; i=i+1) {
            if (x[i] == 'a')
            count = count+1;
        }
        System.out.println("Արդյունքը = " + count);
    }
}
