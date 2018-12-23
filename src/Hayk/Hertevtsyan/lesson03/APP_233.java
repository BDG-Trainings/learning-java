package Hayk.Hertevtsyan.lesson03;

public class APP_233 {
    public static void main(String[] args){
        int res = 1;
        int sum = 0;
        int massive [] = {12,-13,14,-3,14,-5,22,4,-1,54,0,22};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i=0; i < massive.length; i=i+1) {
            if (massive[i]%2 == 0 && massive[i] !=0) {
//                System.out.println(massive[i]);
                res=res * massive[i];
                sum=sum+massive[i];
            }
        }
        System.out.println("Զույգ տարրերի գումարը = " + sum);
        System.out.println("Զույգ տարրերի արտադրյալը = " + res);
    }
}
