package aghalayan.lessons_04.works_291_300;

public class Homework295 {
    public static void main(String []args){
    int n = 9;
    int X[] = {0, 2, 7, -6, 8, 21, -12, 6, -6};
    int i = 0;
    int j = 0;
    int qanak = 0;
    while(i < n){
        if (i% 2 != 0) {
            ++qanak;
        }i++;
    }i=0;
    int Y[] = new int[qanak];
    while (i < n) {
        if (i% 2 != 0) {
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




