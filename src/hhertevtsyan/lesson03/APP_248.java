package hhertevtsyan.lesson03;

public class APP_248 {
    public static void main(String[] args){
        int k=3;
        int sum = 0;
        int massive [] = {12,-13,14,-3,14,-5,22,4,-1,54,0,22};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i=0; i < massive.length; i=i+1) {
            if (((massive[i] + i)*(massive[i]+i)) % k == 0 ) {
//               System.out.println(massive[i]);
                sum = sum + massive[i];
            }
        }
        System.out.println("Գումարը = " + sum);
    }
}
