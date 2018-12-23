package Hayk.Hertevtsyan.lesson03;

public class APP_242 {
    public static void main(String[] args){
        int res=1;
        int m=7;
        int massive [] = {12,-13,14,-3,14,-5,22,4,-1,50,21,22};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i=0; i < massive.length; i=i+1) {
            if (massive[i] % m == 0 && massive[i] != 0) {
                //               System.out.println(massive[i]);
                res = res * massive[i];
            }
        }
        System.out.println("m-ին բազմապատիկ տարրերի արտադրյալը = " + res);
    }
}
