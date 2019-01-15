package hhertevtsyan.lesson03;

public class APP_243 {
    public static void main(String[] args){
        int count = 0;
        int t=3;
        int massive [] = {12,-13,14,-3,14,-5,22,4,-1,54,21,22};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i=0; i < massive.length; i=i+1) {
            if (massive[i] % t == 0 && massive[i] != 0) {
                //             System.out.println(massive[i]);
                count = count + 1;
            }
        }
        System.out.println("t-ին բազմապատիկ տարրերի քանակը = " + count);
    }
}
