package aghalayan.lessons_04.works_311_316;

public class Homework311 {
    public static void main(String [] args) {
        int n = 5;
        int X[] = {0, 15, -8, 6, 5};
        int max = X[0];
        int i = 0;
        int qanak = 0;
        int j = 0;
        while (i < n) {
            if (X[i] > 0) {
                qanak++;
            }
            i++;
        }
        i = 0;
        int Y[] = new int[qanak];
        while (i < n) {
            if (X[i] > max) {
                max = X[i];
            }
            i++;
        }
        i = 0;
        while (i < n) {
            if (X[i] > 0) {
                Y[j] = X[i] + max;
                j++;
            }
            i++;
        }j = 0;
        while (j < qanak) {
            System.out.println(Y[j]);
            j++;
        }
    }
}
