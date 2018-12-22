package Hayk.Hertevtsyan.lesson03;

public class APP_269 {
    public static void main(String[] args){
        int n = 12;
        double sumx=0;
        double sumy=0;
        int x [] = {12,-13,14,3,14,-5,22,4,-1,54,0,22};
        System.out.println("X Զանգվածի երկարությունը = " + n);
        for (int i=2; i < n; i=i+2) {
            sumx = sumx+x[i];
        }
        int y [] = {12,-13,1,-3,14,-5,22,4,-1,9,1,-22};
        System.out.println("Y Զանգվածի երկարությունը = " + n);
        for (int i=1; i < n; i=i+2) {
            sumy = sumy+y[i];
            }
        System.out.println("Արդյունքը = " + (sumx+sumy));
    }
}
