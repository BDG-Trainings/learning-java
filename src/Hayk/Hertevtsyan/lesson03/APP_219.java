package Hayk.Hertevtsyan.lesson03;

public class APP_219 {
    public static void main(String[] args) {
        int count = 0;
        int k = 3;
        int massive[] = {12, -13, 14, -3, 14, -5, 30, 4, -1, 54, 1, 60};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i = 1; i < massive.length; i = i + 1) {
            if (i % k == 0) {
                count = count + 1;
            }
        }
        System.out.println("k-ին բազմապատիկ ինդեքսով տարրերի քանակը  = " + count);
    }
}
