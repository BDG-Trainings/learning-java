package src.Hayk.Hertevtsyan.lesson04;

public class App_341 {
    public static void main(String[] args) {
        int n = 26;
        int count = 0;
        int countx = 0;
        int X[] = {5, 8, 9, 14, 7, 0, 6, 1, 0, 7, 22, 21, 14, 4, 1, 78, 25, 47, 54, 78, 7, 7, 6, 11, 13, 16};
        for (int k = 0; k < n; k = k + 1) {
            for (int i = 0; i < n; i = i + 1) {
                if (X[k] != X[i]) {
                    count = count + 1;
                }
            }
            if (count == n - 1) {
                countx = countx + 1;
            }
            count = 0;
        }
        System.out.println(countx);
    }
}
