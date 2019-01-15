package hhertevtsyan.lesson03;

public class APP_227 {
    public static void main(String[] args) {
        double count = 0;
        double sum = 0;
        int k=3;
        int massive[] = {12, -13, 14, -3, 14, -5, 30, 4, -1, 56, 1, 60};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i = k; i < massive.length; i = i + k) {
            sum=sum+massive[i];
            count = count + 1;
            }
        System.out.println("k-ին բազմապատիկ ինդեքսով տարրերի միջին թվաբանականը  = " + sum/count);
    }
}
