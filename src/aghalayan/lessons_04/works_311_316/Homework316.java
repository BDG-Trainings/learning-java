package aghalayan.lessons_04.works_311_316;

public class Homework316 {
    public static void main(String[] args) {
        int n = 6;
        int X[] = {0, 8, 9, -6, -3, 5};
        int Y[] = new int[n];
        int i = 0;
        int j = 0;
        int max = X[i];
        int min = X[i];
        while (i < n) {
            if (X[i] > max) {
                max = X[i];
            }
            i++;
        }
        i = 0;
        while (i < n) {
            if (X[i] < min) {
                min = X[i];
            }
            i++;
        }
        i = 0;
        while (i < n) {
            if (Math.abs(X[i]) < ((max + min) / 2)) {
                Y[j] = X[i];
                j++;

            }
            i++;
        }j=0;
        while(j < n){
            System.out.println(Y[j]);
            j++;
        }

        }
    }


