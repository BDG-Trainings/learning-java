package src.ofeliasahakyan.lesson_4;

public class Task311_312 {
    public static void main(String args[]){
        int[] x = {-1,0, -10, 2, 12, 9, 11, 3, 7};
        // 311
        int max = 0;
        for(int i = 0; i < x.length; i++ ){
            if(x[i]>= max){
                max = x[i];
            }
        }
        int y_11_length = 0;
        for(int i = 0; i< x.length; i++){
            if(x[i]> 0){
                y_11_length++;
            }
        }
        int[] y_11 = new int[y_11_length];
        int k = 0;
        for(int i = 0; i< x.length; i++){
            if(x[i]>0){
                y_11[k] = x[i] + max;
                k++;
            }
        }
        for(int i = 0; i< y_11_length; i++){
            System.out.print("311:" + y_11[i] + ",");
        }
        System.out.print("\n");
        //312
        int[] y_12 = new int[x.length/2];
        int n = 0;
        for( int i = 0; i<x.length; i++){
            if(Math.abs(x[i]) > Math.abs(x[i+1])){
                y_12[n] = x [i];
            } else{
                y_12[n] = x[i+1];
            }
            n++;
        }
        for(int i = 0; i< x.length/2; i++){
            System.out.print("312:" + y_12[i] + ",");
        }
        System.out.print("\n");
    }
}

