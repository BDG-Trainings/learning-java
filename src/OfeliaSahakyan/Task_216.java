package src.OfeliaSahakyan;

public class Task_216 {
    public static void main(String[] args){
        int[] Array = {1, 1, 0, 0, 2, 3, 5};

        int product = 1;
        for(int i = 0; i < Array.length; i++){
            if(i % 2 == 0){
                product = product * Array[i];
            }
        }
        System.out.print("product of pair index elements:" + product);
    }
}
