package hhertevtsyan.lesson03;

public class APP_224 {
    public static void main(String[] args) {
        int res = 0;
        int k=23;
        int massive[] = {12, -13, 14, -3, 14, -5, 30, 4, -1, 54, 1, 60};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i = 0; i < massive.length; i = i + 1) {
            if (Math.abs(massive[i]) < k) {
                res = res + massive[i]*massive[i]*massive[i];
            }
        }
        System.out.println("k-ից մոդուլով փոքր տարրերի խորանարդների գումարը  = " + res);
    }
}
