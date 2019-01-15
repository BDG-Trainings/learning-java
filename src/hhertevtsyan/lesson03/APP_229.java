package hhertevtsyan.lesson03;

public class APP_229 {
    public static void main(String[] args) {
        int res = 1;
        int massive[] = {12, -13, 14, -3, 14, -5, 30, 4, -1, 56, 1, 60};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i = 0; i < massive.length; i = i + 1) {
            if (massive[i]- i >0)
                res=res*massive[i];
        }
        System.out.println("Պայմանին բավարարող տարրերի արտադրյալը  = " + res);
    }
}
