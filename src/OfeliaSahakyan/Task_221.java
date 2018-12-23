package src.OfeliaSahakyan;

public class Task_221 {
    public static void main(String[] args){
        int[] Array = {1, 1, 2, 0, 2, 3, 5};

        int sum = 0;
        int a = 1;
        int b = 3;
        for(int i = 0; i < Array.length; i++){
            if(Array[i]>= a && Array[i]<= b){
                sum = sum + Array[i];
            }
        }
        System.out.print(sum);
    }
}
