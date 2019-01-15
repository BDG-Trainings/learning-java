package hhertevtsyan.lesson03;

public class APP_228 {
    public static void main(String[] args) {
        int sum = 0;
        int k=2;
        int massive[] = {12, -13, 14, -3, 14, -5, 30, 4, -1, 56, 1, 60};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i = k; i < massive.length; i = i + k) {
            sum=sum+massive[i];
            }
        System.out.println("k-ին բազմապատիկ ինդեքսով տարրերի գումարը  = " + sum);
    }
}
