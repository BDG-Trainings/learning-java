package hhertevtsyan.lesson03;

public class APP_245 {
    public static void main(String[] args){
        int res = 0;
        int massive [] = {12,-13,14,-3,14,-5,22,4,-1,54,0,22};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i=0; i < massive.length; i=i+1) {
            if ((massive[i]+i)%3 == 0) {
//                System.out.println(massive[i]);
                res=res + massive[i]*massive[i];
            }
        }
        System.out.println("Արդյունքը = " + res);
    }
}
