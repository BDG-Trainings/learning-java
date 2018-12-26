package ArmenIskandaryan.Lesson_04;

public class App_280 {
    public static void main(String[] args) {
        char[] arrX = {'a', 'b', 'd', 'a', 'r', 'f', 'b', 'a', 'r', 'c'};
        int count = 0;
        for(int i = 0; i < arrX.length; i++) {
            if (arrX[i] == 'f') {
                count++;
            }
        }
        char[] arrY = new char[arrX.length + count];
        int j = 0;
        for (int i = 0; i < arrX.length; i++) {
            arrY[j] = arrX[i];
            j++;
            if (arrX[i] == 'f') {
                arrY[j] = 'f';
                j++;
            }
        }
    }
}
