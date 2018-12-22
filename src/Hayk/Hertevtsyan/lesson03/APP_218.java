package Hayk.Hertevtsyan.lesson03;

public class APP_218 {
    public static void main(String[] args){
        int res=0;
        int massive [] = {12,-13,14,-3,14,-5,22,4,-1,54,1,22};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i=1; i < massive.length; i=i+2) {
            res=res+Math.abs(massive[i]);
        }
        System.out.println("Կենտ ինդեքսով թվերի բացարձակ արժեքների գումարը  = " + res);
    }
}
