package hhertevtsyan.lesson03;

public class APP_263 {
    public static void main(String[] args){
        int n = 12;
        int countx=0;
        int county=0;
        int x [] = {12,-13,14,3,14,-5,22,4,-1,54,0,22};
        System.out.println("X Զանգվածի երկարությունը = " + n);
        for (int i=0; i < n; i=i+1) {
            if (x[i]>0) {
                countx = countx+1;
            }
        }
        int y [] = {12,-13,1,-3,14,-5,22,4,-1,9,0,22};
        System.out.println("Y Զանգվածի երկարությունը = " + n);
        for (int i=0; i < n; i=i+1) {
            if (y[i]>0) {
                county = county+1;
            }
        }
        System.out.println("Դրական տարրերի ընդհանուր քանակը = " + (countx + county));
    }
}
