package src.OfeliaSahakyan;

public class Task_220 {
    public static void main(String[] args){
        int[] Array = {1, 1, 0, 0, 2, 3, 5};

        int pc = 0;
        int nc = 0;
        for(int i = 0; i < Array.length; i++){
            if(Array[i] > 0){
                pc = pc + 1;
            } else{
             nc = nc + 1;
            }
        }
        System.out.print(pc);
        System.out.print(nc);
    }
}
