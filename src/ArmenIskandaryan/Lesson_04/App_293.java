package ArmenIskandaryan.Lesson_04;

public class App_293 {
    public static void main(String[] args) {
        int [] arrX = {1, 15, -20, 50, -21, -8, 52, 27, -10, -3};
        int a = -10;
        int b = 50;
        int count = arrX.length;
        for (int i = 0; i < arrX.length; i++) {
            if((arrX[i] > a && arrX[i] < b) || (arrX[i] > b && arrX[i] < a)) {
                count--;
            }
        }
        int[] arrY = new int [count];
        int j = 0;
        for (int i = 0; i < arrX.length; i++) {
            if((arrX[i] > a && arrX[i] > b) || (arrX[i] < b && arrX[i] < a)) {
                arrY[j] = arrX[i];
                j++;
            }
        }
        for (int i = 0; i < arrY.length; i++) {
            System.out.println(i + " -> " + arrY[i]);
        }
    }
}
