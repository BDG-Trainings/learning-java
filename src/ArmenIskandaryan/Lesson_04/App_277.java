package ArmenIskandaryan.Lesson_04;

public class App_277 {
    public static void main(String[] args) {
        char[] arrX = {'a', 'b', 'd', 'a', 'r', 'd', 'b', 'a', 'r'};
        int count = arrX.length;
        for (int i = 0; i < arrX.length; i++) {
            if(arrX[i] == 'd') {
                count--;
            }
        }
        char[] arrY = new char[count];
        int j = 0;
        for (int i = 0; i < arrX.length; i++) {
            if(arrX[i] == 'd') {
                arrY[j] = arrX[i];
                j++;
            }
        }
    }
}
