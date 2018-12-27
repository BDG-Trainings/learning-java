package ArmenIskandaryan.Lesson_04;

public class App_316 {
    public static void main(String[] args) {
        int [] arrX = {1, 15, -20, 50, -21, -8, 52, 27, -10, -3, -5};
        int max = arrX[0];
        int min = arrX[0];
        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] > max) {
                max = arrX[i];
            }
            if (arrX[i] < min) {
                min = arrX[i];
            }
        }
        int mt = (min + max) / 2;
        int yCount = 0;
        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] < mt) {
                yCount++;
            }
        }
        int [] arrY = new int[yCount];
        int j = 0;
        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] < mt) {
                arrY[j] = arrX[i];
                j++;
            }
        }
        for (int i = 0; i < arrY.length; i++) {
            System.out.println(i + " -> " + arrY[i]);
        }
    }
}
