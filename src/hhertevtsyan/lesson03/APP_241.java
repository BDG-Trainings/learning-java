package hhertevtsyan.lesson03;

public class APP_241 {
    public static void main(String[] args){
        int sum=0;
        int k=5;
        int massive [] = {12,-13,14,-3,14,-5,22,4,-1,50,21,22};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i=0; i < massive.length; i=i+1) {
            if (massive[i] % k == 0 && massive[i] != 0) {
                //               System.out.println(massive[i]);
                sum = sum + massive[i];
            }
        }
        System.out.println("k-ին բազմապատիկ տարրերի գումարը = " + sum);
    }
}
