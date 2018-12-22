package Hayk.Hertevtsyan.lesson03;

public class APP_215 {
    public static void main(String[] args){
        int sum=0;
        int massive [] = {12,-13,14,-3,14,-5,22,4,-1,54,0,22};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i=2; i < massive.length; i=i+2) {
                sum=sum + massive[i];
            }
        System.out.println("Զույգ ինդեքսով թվերի գումարը  = " + sum);
            }
}
