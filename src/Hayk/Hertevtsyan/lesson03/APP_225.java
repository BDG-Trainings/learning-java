package Hayk.Hertevtsyan.lesson03;

public class APP_225 {
    public static void main(String[] args) {
        int res = 1;
        int t=23;
        int massive[] = {12, -13, 14, -3, 14, -5, 30, 4, -1, 54, 1, 60};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i = 0; i < massive.length; i = i + 1) {
            if (Math.abs(massive[i]) < t) {
                res = res * massive[i];
            }
        }
        System.out.println("t-ից մոդուլով փոքր տարրերի արտադրյալը  = " + res);
    }
}
