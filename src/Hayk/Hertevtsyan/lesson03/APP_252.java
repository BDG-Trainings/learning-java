package Hayk.Hertevtsyan.lesson03;

public class APP_252 {
    public static void main(String[] args) {
        int massive[] = {12, -13, 14, -3, 74, -5, 22, 4, -1, -54, 0, 62};
        int min=massive[0];
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i = 0; i < massive.length; i = i + 1) {
            if ( massive[i]<min) {
//                System.out.println(massive[i]);
                min = massive[i];
            }
        }
        System.out.println("Զանգվածի փոքրագույն տարրը = " + min);
    }
}
