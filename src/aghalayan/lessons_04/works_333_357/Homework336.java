package aghalayan.lessons_04.works_333_357;

public class Homework336 {
    public static void main(String[] args) {
        int n = 5;
        int X[] = {5, 10, 6, 8, 11};
        int i = 0;
        int max = X[0];
        while (i < n) {
            if (X[i] < 0) {
            System.out.print("s=0");
            return;
            }
            if (X[i] > max) {
            max = X[i];
            }
            i++;
        }System.out.print(max);
    }
}
