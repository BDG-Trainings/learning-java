package Hayk.Hertevtsyan.lesson03;

public class APP_220 {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int massive[] = {12, -13, 14, -3, 14, -5, 0, 4, -1, 54, 1, 60};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i = 0; i < massive.length; i = i + 1) {
            if (massive[i] > 0) {
                count1 = count1 + 1;
            } else if (massive[i] < 0) {
                count2 = count2 + 1;
            }
        }
        System.out.println("Դրական տարրերի քանակը  = " + count1);
        System.out.println("Բացասական տարրերի քանակը  = " + count2);
    }
}
