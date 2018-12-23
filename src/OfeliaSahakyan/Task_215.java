package src.OfeliaSahakyan;

public class Task_215 {
    public static void main(String[] args){
        int[] Array = {1, 1, 2, 0, 2, 3, 5};

        int sum = 0;
        for(int i = 0; i < Array.length; i++){
            if(i % 2 == 0){
                sum = sum + Array[i];
            }
        }
        System.out.print("sum of pair index elements:" + sum);
    }
}
