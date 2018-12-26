package ArmenIskandaryan.Lesson_04;

public class App_278 {
    public static void main(String[] args) {
        char[] arrX = {'a', 'b', 'd', 'a', 'r', 'd', 'b', 'a', 'r', '5'};
        int tmp = arrX.length;
        double yCount = Math.ceil(tmp/2);
        char[] arrY = new char[(int)yCount];

        for (int i = 0; i < arrY.length; i++) {
            arrY[i] = arrX[1 + 2 * i];
            System.out.println(arrY[i]);
        }
    }
}
