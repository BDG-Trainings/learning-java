package hhertevtsyan.lesson03;

public class APP_239 {
    public static void main(String[] args){
        int count = 0;
        double sum = 0;
        int massive [] = {12,-13,14,-3,14,-5,22,4,-1,54,25,22};
        System.out.println("Զանգվածի երկարությունը = " + massive.length);
        for (int i=0; i < massive.length; i=i+1) {
            if (massive[i] % 5 == 0 && massive[i] != 0) {
//                System.out.println(massive[i]);
                count = count + 1;
                sum = sum + massive[i] * massive[i];
            }
        }
        System.out.println("5-ին բազմապատիկ տարրերի միջին քառակուսայինը = " + Math.sqrt(sum / count));
    }
}
