public class Homework261{

     public static void main(String []args){
        int n = 5;
        int [] X = new int[n];
        int [] Y = new int [n];
        X [0] = 1;
        X [1] = -1;
        X [2] = 4;
        X [3] = -12;
        X [4] = 0;
        Y [0] = 6;
        Y [1] = -3;
        Y [2] = 6;
        Y [3] = 1;
        Y [4] = -5;
        int i= 0;  
        int gumarX= 0;
        int gumarY = 0;
        while (i < n){
            gumarX = gumarX + X[i];
            gumarY = gumarY + Y[i];
            i++;
        }
       System.out.print((double)gumarX/n *(double)gumarY/n);
     }
}
