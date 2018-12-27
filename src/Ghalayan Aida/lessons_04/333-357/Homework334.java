package lessons_04;

public class Homework334 {
    public static void main(String[] args) {
        int n = 5;
        int X[] = {5, 10, 6, -8, 11};
        int i = 1;
        int gumar = 0;
        int artadryal = 1;
        while (i < n) {
            if (X[i] > X[i - 1] && i < n / 2) {
                if (X[i] > 0) {
                    gumar += X[i];
                    } else if (X[i] < 0) {
                    artadryal = artadryal * X[i];
                  }
            }
            i++;
        }System.out.println(gumar);
        System.out.println(artadryal);
    }
}