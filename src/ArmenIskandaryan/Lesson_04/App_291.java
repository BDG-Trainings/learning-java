package ArmenIskandaryan.Lesson_04;

public class App_291 {
    public static void main(String[] args) {
        int [] arrX = {1, 15, -20, 50, -21, -8, 52, 7, -10, -3};
        int count = arrX.length;
        for (int i = 0; i < arrX.length; i++) {
            if(arrX[i] <= 0) {
                count--;
            }
        }
        int[] arrY = new int [count];
        int j = 0;
        for (int i = 0; i < arrX.length; i++) {
            if(arrX[i] <= 0) {
                arrY[j] = arrX[i];
                j++;
            }
        }
        for (int i = 0; i < arrY.length; i++) {
            System.out.println(i + " -> " + arrY[i]);
        }
    }
}
