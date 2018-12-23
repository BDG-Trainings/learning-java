package src.OfeliaSahakyan;

public class Task_218 {
    public static void main(String[] args){
        int[] Array = {1, 1, 0, 0, 2, 3, 5};

        int sum = 0;
        for(int i = 0; i < Array.length; i++){
            if(i % 2 != 0);{
                sum = sum + Math.abs(Array[i]);
            }
        }
        System.out.print("sum of add index elements absolute values :" + sum);
    }
}
