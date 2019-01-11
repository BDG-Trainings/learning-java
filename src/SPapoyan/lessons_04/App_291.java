package SPapoyan.lessons_04;

public class App_291 {
    public static void main (String[]args) {

        int [] X = {1,2,3,-4,5,-6,-7,8,-9,10};
        int [] Y = new int[X.length];
        int k = 0;
        for (int i=0; i<X.length; i++) {
            if (X[i] < 0)
                Y[k] = X[i];
            k++;
        }
        for (int i = 0; i < Y.length; i++) {

            System.out.print(Y[i] + ",");
        }
    }
}
