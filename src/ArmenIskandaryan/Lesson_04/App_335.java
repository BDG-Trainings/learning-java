package ArmenIskandaryan.Lesson_04;

public class App_335 {
    public static void main(String[] args) {
        int [] arrX = {1, 15, -20, 50, -21, -8, 5, 27, -10, 3, -5};
        int index = 1;
        for (int i = 2; i < arrX.length - 1; i++) {
            if (arrX[i - 1] + arrX[i + 1] > arrX[index - 1] + arrX[index + 1]) {
                index = i;
            }
        }
        System.out.println(index + " -> " + arrX[index]);
    }
}
