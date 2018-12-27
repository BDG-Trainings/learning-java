package lessons_04;

public class Homework298 {
    public static void main(String []args){
        int n = 9;
        int X[] = {0, 2, -7, -6, 8, 21, -12, 6, -5};
        int i = 0;
        int j = 0;
        int qanak = 0;
        while(i < n){
            if (X[i]% 2 == 1 || X[i]% 2 == -1) {
                ++qanak;
            }i++;
        }i=0;
        int Y[] = new int[qanak];
        while (i < n) {
            if (X[i]% 2 == 1 || X[i]% 2 == -1) {
                Y[j] = X[i];
                j++;
            }i++;
        }j = 0;
        while (j < qanak) {
            System.out.println(Y[j]);
            j++;
        }
    }
}

