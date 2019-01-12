package SPapoyan.lessons_04;

import java.util.Arrays;

public class App_291 {
    public static void main (String[]args) {

        int [] X = {1,2,3,-4,5,-6,-7,8,-9,10};
        int k = 0;
        for (int i=0; i<X.length; i++) {
            if (X[i] < 0)
                k++;
                //System.out.print(X[i] + ",");
        }
            int j = 0;
        int [] Y = new int[k];
        for (int i = 0; i < X.length; i++) {
            if (X[i] < 0) {
                Y[j] = X[i];
                j++;
            }
        }System.out.println(Arrays.toString(Y));
    }
}
