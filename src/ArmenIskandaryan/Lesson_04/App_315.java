package ArmenIskandaryan.Lesson_04;

public class App_315 {
    public static void main(String[] args) {
        int [] arrX = {1, 15, -20, 50, -21, -8, 52, 27, -10, -3, -5};
        int b = -50;
        int positiveCount = 0;
        int negativeCount = 0;
        boolean ind = false;
        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
            if (arrX[i] < b) {
                ind = true;
            }
        }
        int[] arrY;
        if (ind) {
            arrY = new int [positiveCount];
        } else {
            arrY = new int [negativeCount];
        }
        int j = 0;
        for (int i = 0; i < arrX.length; i++) {
            if (ind) {
                if (arrX[i] > 0) {
                    arrY[j] = arrX[i];
                    j++;
                }
            } else {
                if (arrX[i] <= 0) {
                    arrY[j] = arrX[i];
                    j++;
                }
            }
        }
        for (int i = 0; i < arrY.length; i++) {
            System.out.println(i + " -> " + arrY[i]);
        }
    }
}
