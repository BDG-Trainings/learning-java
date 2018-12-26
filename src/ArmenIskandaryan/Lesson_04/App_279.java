package ArmenIskandaryan.Lesson_04;

public class App_279 {
    public static void main(String[] args) {
        char[] arrX = {'a', 'b', 'd', 'a', 'r', 'd', 'b', 'a', 'r', 'c'};
        int count = 0;
        for(int i = 0; i < arrX.length; i++) {
            if (arrX[i] > 'k') {
                count++;
            }
        }
        char[] arrY = new char[count];
        int j = 0;
        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] > 'k') {
                arrY[j] = arrX[i];
                j++;
            }
        }
    }
}
