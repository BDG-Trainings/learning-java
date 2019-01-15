package hhertevtsyan.lesson03;

public class APP_251 {
    public static void main(String[] args) {
        int massive[] = {12, -13, 14, -3, 74, -5, 22, 4, -1, 54, 0, 62};
        int max=massive[0];
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i = 0; i < massive.length; i = i + 1) {
            if ( massive[i]>max) {
//                System.out.println(massive[i]);
                max = massive[i];
            }

        }
        System.out.println("Զանգվածի մեծագույն տարրը = " + max);
    }
}
