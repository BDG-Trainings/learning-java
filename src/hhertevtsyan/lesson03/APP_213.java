package hhertevtsyan.lesson03;

public class APP_213 {
    public static void main(String[] args){
        int i = 0;
        double sum=0;
        int count=0;
        double massive [] = {12,-13,14,-3,14,-5,22,4,-1,54,0,22};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (i=0; i < massive.length; i=i+1) {
            if (massive[i] < 0) {
                count=count+1;
                sum=sum + Math.pow(massive[i],2);
            }
        }
        System.out.println("Բացասական թվերի քանակը = " + count);
        System.out.println("Միջին քառակուսայինը = " + Math.sqrt(sum/count));
    }
}
