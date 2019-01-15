package src.ofeliasahakyan.lesson_4;

public class Task291_300 {
    public static void main(String args[]){
        int[] x = {10, 11, 3, -3, 11, 10, 7};
        //291
        int length_y_1 = 0;
        for(int i = 0; i<x.length; i++){
            if(x[i]<0){
                length_y_1++;
            }
        }
        int[] y_1 = new int[length_y_1];
        int k = 0;
        for(int i = 0; i< x.length; i++){
            if(x[i]<0){
                y_1[k] = x[i];
                k++;
            }
        }
        for(int i = 0; i<length_y_1;i++){
            System.out.print("291:" + y_1[i] + ",");
        }
        System.out.print("\n");
        //292
        int length_y_2 = 0;
        for(int i = 0; i<x.length; i++){
            if(x[i]%7 == 0){
                length_y_2++;
            }
        }
        int[] y_2 = new int[length_y_2];
        int m = 0;
        for(int i = 0; i< x.length; i++){
            if(x[i]%7==0){
                y_2[m] = x[i];
                m++;
            }
        }
        for(int i = 0; i<length_y_2;i++){
            System.out.print("292:" + y_2[i] + ",");
        }
        System.out.print("\n");
        //293
        int length_y_3 = 0;
        for(int i = 0; i<x.length; i++){
            if(x[i]>5 && x[i] < 12){
                length_y_3++;
            }
        }
        int[] y_3 = new int[length_y_3];
        int n = 0;
        for(int i = 0; i< x.length; i++){
            if(x[i]>5 && x[i] < 12){
                y_3[n] = x[i];
                n++;
            }
        }
        for(int i = 0; i<length_y_3;i++){
            System.out.print("293:" + y_3[i] + ",");
        }
        System.out.print("\n");
        //295
        int length_y_5 = 0;
        for(int i = 0; i<x.length; i++){
            if(i %2 == 0){
                length_y_5++;
            }
        }
        int[] y_5 = new int[length_y_5];
        int b = 0;
        for(int i = 0; i< x.length; i++){
            if(i %2 == 0){
                y_5[b] = x[i];
                b++;
            }
        }
        for(int i = 0; i<length_y_5;i++){
            System.out.print("295:" + y_5[i] + ",");
        }
        System.out.print("\n");
        //296
        int length_y_6 = 0;
        for(int i = 0; i<x.length; i++){
            if(x[i]%7 == 2){
                length_y_6++;
            }
        }
        int[] y_6 = new int[length_y_6];
        int v = 0;
        for(int i = 0; i< x.length; i++){
            if(x[i]%7==2){
                y_6[v] = x[i];
                v++;
            }
        }
        for(int i = 0; i<length_y_6;i++){
            System.out.print("296:" + y_6[i] + ",");
        }
        System.out.print("\n");
        //297
        int length_y_7 = 0;
        int l = 2;
        for(int i = 0; i<x.length; i++){
            if(Math.abs(x[i]) > l){
                length_y_7++;
            }
        }
        int[] y_7 = new int[length_y_7];
        int c = 0;
        for(int i = 0; i< x.length; i++){
            if(Math.abs(x[i])> l){
                y_7[c] = x[i];
                c++;
            }
        }
        for(int i = 0; i<length_y_7;i++){
            System.out.print("297:" + y_7[i] + ",");
        }
        System.out.print("\n");
        //300
        int length_y_0 = 0;
        int u = 103;
        for(int i = 0; i<x.length; i++){
            if(Math.pow(x[i], 2) < u){
                length_y_0++;
            }
        }
        int[] y_0 = new int[length_y_0];
        int a = 0;
        for(int i = 0; i< x.length; i++){
            if(Math.pow(x[i],2) < 103){
                y_0[a] = x[i];
                a++;
            }
        }
        for(int i = 0; i<length_y_0;i++){
            System.out.print("300:" + y_0[i] + ",");
        }
    }
}
