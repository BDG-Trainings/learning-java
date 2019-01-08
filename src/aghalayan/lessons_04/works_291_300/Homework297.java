package aghalayan.lessons_04.works_291_300;

public class Homework297 {
    public static void main(String []args){
        int n = 9;
        int X[] = {0, 2, 8, -6, 1, 21, -12, -1, -6};
        int i = 0;
        int j = 0;
        int qanak = 0;
        int k = 3;
        while(i < n){
            if (X[i]< k && -(X[i]) < k) {
                ++qanak;
            }i++;
        }i=0;
        int Y[] = new int[qanak];
        while (i < n) {
            if (X[i]< k && -(X[i]) < k) {
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

