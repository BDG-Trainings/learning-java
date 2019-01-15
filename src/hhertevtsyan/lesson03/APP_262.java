package hhertevtsyan.lesson03;

public class APP_262 {
    public static void main(String[] args){
        int n = 12;
        double sumx=0;
        double sumy=0;
        int x [] = {12,-13,14,-3,14,-5,22,4,-1,54,0,22};
        System.out.println("X Զանգվածի երկարությունը = " + n);
        for (int i=0; i < n; i=i+1) {
            sumx=sumx + Math.pow(x[i],2);
            }
        int y [] = {12,-13,1,-3,14,-5,22,4,-1,9,0,22};
        System.out.println("Y Զանգվածի երկարությունը = " + n);
        for (int i=0; i < n; i=i+1) {
            sumy=sumy + Math.pow(y[i],2);
        }
        System.out.println("Միջին քառակուսայինների գումարը = " + (Math.sqrt(sumx/n) + Math.sqrt(sumy/n)));
    }
}
