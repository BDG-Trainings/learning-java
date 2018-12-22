package Hayk.Hertevtsyan.lesson03;

public class APP_265 {
    public static void main(String[] args){
        int n = 12;
        double sumx=0;
        double resy=1;
        int x [] = {12,-13,14,3,14,-5,22,4,-1,54,0,22};
        System.out.println("X Զանգվածի երկարությունը = " + n);
        for (int i=0; i < n; i=i+1) {
                sumx = sumx+x[i];
        }
        int y [] = {12,-13,1,-3,14,-5,22,4,-1,9,1,-22};
        System.out.println("Y Զանգվածի երկարությունը = " + n);
        for (int i=0; i < n; i=i+1) {
                resy = resy*y[i];
        }
        System.out.println("Արդյունքը = " + (sumx/resy));
    }
}
