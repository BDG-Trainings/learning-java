package lessons_04;

public class Homework291 {
    public static void main(String[] args) {
        int n = 9;
        int X[] = {0, -2, 5, -6, 8, 9, -12, 6, -6};
        int i = 0;
        int j = 0;
        int qanak = 0;
        while(i < n){
            if (X[i]< 0) {
                qanak++;
            }i++;
        }i=0;
        int Y[] = new int[qanak];
        while (i < n) {
            if (X[i] < 0) {
                Y[j] = X[i];
                j++;
            }
            i++;
        }
        j = 0;
        while (j < qanak) {
            System.out.print(Y[j]);
j++;        }
    }
}