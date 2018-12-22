package Hayk.Hertevtsyan.lesson03;

public class APP_222 {
    public static void main(String[] args) {
        int res = 1;
        int c=13;
        int d=50;
        int massive[] = {12, -13, 14, -3, 14, -5, 30, 4, -1, 54, 1, 60};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i = 0; i < massive.length; i = i + 1) {
            if (massive[i] >= c && massive[i] < d) {
                res = res * massive[i];
            }
        }
        System.out.println("[c,d) միջակայքի թվերի արտադրյալը  = " + res);
    }
}
