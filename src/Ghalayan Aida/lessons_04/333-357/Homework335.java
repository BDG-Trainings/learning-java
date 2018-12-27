package lessons_04;

public class Homework335 {
    public static void main(String[] args) {
        int n = 5;
        int X[] = {5, 10, 6, -8, 11};
        int i = 1;
        int max = X[0]+X[2];
        int index = 1;
        int arjeq = X[1];
        while (i < (n - 1)){
            if ((X[i - 1] + X[i + 1]) > max) {
               max = (X[i - 1] + X[i + 1]);
               index = i;
               arjeq = X[i];
            }
            i++;
        }
        System.out.println("zangvaci tarr@:" + i + "," + "zangvaci arjeq@:" + X[i]);
    }
}