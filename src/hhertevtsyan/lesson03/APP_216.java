package hhertevtsyan.lesson03;

public class APP_216 {
    public static void main(String[] args){
        int res=1;
        int massive [] = {12,-13,14,-3,14,-5,22,4,-1,54,1,22};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i=2; i < massive.length; i=i+2) {
            res=res * massive[i];
        }
        System.out.println("Զույգ ինդեքսով թվերի արտադրյալը  = " + res);
    }
}
