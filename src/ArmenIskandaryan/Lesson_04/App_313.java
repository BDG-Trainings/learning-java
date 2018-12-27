package ArmenIskandaryan.Lesson_04;

import java.util.Arrays;

public class App_313 {
    public static void main(String[] args) {
        int [] arrX = {1, 15, -20, 50, -21, -8, 52, 27, -10, -3};
        int [] arrY = Arrays.copyOf(arrX, arrX.length);
        int yCount = 0;
        for (int i = 1; i * 2 < arrY.length; i++) {
            int tmp = arrY[i * 2 - 1];
            arrY[i * 2 - 1] = arrY[i * 2];
            arrY[i * 2] = tmp;
        }
        for (int i = 0; i < arrY.length; i++) {
            System.out.println(i + " -> " + arrY[i]);
        }
    }
}
