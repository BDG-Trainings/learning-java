package ArmenIskandaryan.Lesson_04;

public class App_339 {
    public static void main(String[] args) {
        int [] arrX = {1, 15, -20, 50, -21, -8, 5, 27, -10, 3, -5};
        int maxIndex = 0;
        for (int i = 1; i * 3 < arrX.length; i++) {
            if (arrX[i * 3] > arrX[maxIndex]) {
                maxIndex = i * 3;
            }
        }
        System.out.println(maxIndex + " -> " + arrX[maxIndex]);
    }
}