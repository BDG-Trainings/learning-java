package hhertevtsyan.lesson03;

public class APP_217 {
    public static void main(String[] args){
        long res=1; //Ստիպված Long եմ օգտագործել, որ արտադրյալը տեղավորվի
        int massive [] = {12,-13,14,-3,14,-5,22,4,-1,54,1,22};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i=1; i < massive.length; i=i+2) {
            res=res*massive[i]*massive[i];
            }
        System.out.println("Կենտ ինդեքսով թվերի քառակուսիների արտադրյալը  = " + res);
    }
}
