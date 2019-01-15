package hhertevtsyan.lesson03;

public class APP_230 {
    public static void main(String[] args) {
        int k = 3;
        int count = 0;
        double sum = 0;
        double massive[] = {12.3, -13, 14, -3.2, 14.6, -5, 22, 4, -1, 54, 6, 22};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i = 0; i < massive.length; i = i + 1) {
            if (Math.floor(Math.abs(massive[i])) % k == 0) {
//                System.out.println(massive[i]);
                count = count + 1;
                sum = sum + Math.pow(massive[i], 2);
            }
        }
        System.out.println("Քանակը = " + count);
        System.out.println("Միջին քառակուսայինը = " + Math.sqrt(sum / count));
    }
}
