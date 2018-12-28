package lessons_04;

public class Homework315 {
    public static void main(String[] args) {
        int n = 6;
        int X[] = {0, 8, 9, -6, -3, 5};
        int qanakdr = 0;
        int i = 0;
        int b = -10;
        boolean t = false;
        while (i < n) {
            if (X[i] > 0) {
                qanakdr++;
            }
            if (X[i] < b) {
                t = true;
            }
            i++;
        }
        int[] Y;
        if (t = true) {
            Y = new int[qanakdr];
            i = 0;
            int j = 0;
            while (i < n) {
                if (X[i] > 0) {
                    Y[j] = X[i];
                    j++;
                }
                i++;
            }
        } else {
            Y = new int[n - qanakdr];
            i = 0;
            int j = 0;
            while (i < n) {
                if (X[i] <= 0) {
                    Y[j] = X[i];
                    j++;
                }
                i++;
            }
        }
        int j = 0;
        while (j < Y.length) {
            System.out.println(Y[j]);
            j++;
        }
    }
}

