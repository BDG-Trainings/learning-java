package Hayk.Hertevtsyan.lesson03;

public class APP_244 {
    public static void main(String[] args){
        int res = 1;
        int massive [] = {12,-13,14,-3,14,-5,22,4,-1,54,25,22};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i=0; i < massive.length; i=i+1) {
            if (massive[i] % 5 == 2) {
//                System.out.println(massive[i]);
                res = res * massive[i];
            }
        }
        System.out.println("Արտադրյալ = " + res);
    }
}
