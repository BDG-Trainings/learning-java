package lessons_04;

public class Homework296 {
    public static void main(String []args){
        int n = 9;
        int X[] = {0, 2, 8, -6, 8, 21, -12, 6, -6};
        int i = 0;
        int j = 0;
        int qanak = 0;
        int k = 3;
        while(i < n){
            if (X[i]% k != 2) {
                ++qanak;
            }i++;
        }i=0;
        int Y[] = new int[qanak];
        while (i < n) {
            if (X[i]% k != 2) {
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

