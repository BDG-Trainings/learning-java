package lessons_04;

public class Homework312 {
    public static void main(String [] args) {
        int n = 7;
        int X[] = {1, 15, -8, 6, 5, -9, 9};
        int Y[] = new int[n/2];
        int i = 0;
        int j = 0;
        while (i < n-1) {
            if (Math.abs(X[i]) > Math.abs(X[i+1])) {
               Y [j] = X[i];
            }else{
                Y[j] = X [i+1];
            }j++;

        i = i + 2;
        }
        j = 0;
        while (j < n/2) {
            System.out.println(Y[j]);
            j++;
        }
    }
}

