package ArmenIskandaryan.Lesson_04;

import java.util.Arrays;

public class App_314 {
    public static void main(String[] args) {
        int [] arrX = {1, 15, -20, 50, -21, -8, 52, 27, -10, -3};
        int count = 0;
        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] > 0) {
                count++;
            }
        }
        int[] arrY = new int [arrX.length + count];
        count = 0;
        for (int i = 0; i < arrX.length; i++) {
            arrY[i + count] = arrX[i];
            if (arrX[i] > 0) {
                count++;
            }
        }
        for (int i = 0; i < arrY.length; i++) {
            System.out.println(i + " -> " + arrY[i]);
        }
    }
}
