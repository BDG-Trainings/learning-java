package src.OfeliaSahakyan;

public class Task_219 {
    public static void main(String[] args){
        int[] Array = {1, 1, 0, 0, 2, 3, 5};

        int count = 0;
        int k = 3;
        for(int i = 0; i < Array.length; i++){
            if(i % 3 == 0);{
                count = count + 1;
            }
        }
        System.out.print(count);
    }
}
