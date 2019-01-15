package hhertevtsyan.lesson03;

public class APP_255 {
    public static void main(String[] args) {
        int massive[] = {12, -13, 14, -3, 74, -5, 22, 4, -1, 54, 0, 62};
        int max=massive[0];
        int index =0;
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i = 0; i < massive.length; i = i + 1) {
            if ( massive[i]>max) {
                max = massive[i];
                index=i;
            }
        }
        System.out.println("Զանգվածի մեծագույնի և իր ինդեքսի գումարը = " + (max+index));
    }
}
