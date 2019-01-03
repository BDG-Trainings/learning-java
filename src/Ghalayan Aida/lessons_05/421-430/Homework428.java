package lessons_05;

public class Homework428 {
    public static void main(String[] args) {
        int m = 5;
        int[][] matric = Utils.stexcelEvTpelMatric(m, m);
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if ((i + j) <= (m - 1)) {
                    if (matric[i][j] == 0) {
                        count++;

                    }

                }
            }

        }
        System.out.print(count);
    }
}