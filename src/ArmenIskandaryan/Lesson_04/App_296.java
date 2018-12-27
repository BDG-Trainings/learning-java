package ArmenIskandaryan.Lesson_04;

public class App_296 {
    public static void main(String[] args) {
        int [] arrX = {1, 15, -20, 50, -21, -8, 52, 27, -10, -3};
        int k = 5;
        int yCount = 0;
        for (int i = 0; i < arrX.length; i ++) {
            if (arrX[i] % k != 2) {
                yCount++;
            }
        }
        int [] arrY = new int[yCount];
        int j = 0;
        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] % k != 2) {
                arrY[j] = arrX[i];
                j++;
            }
        }
    }
}
