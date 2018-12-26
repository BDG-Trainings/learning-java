package ArmenIskandaryan.Lesson_04;

public class App_333 {
    public static void main(String[] args) {
        int [] arrX = {1, 15, -20, 50, -21, -8, 52, 27, -10, -3, -5};
        int k = 20;
        int sum = 0;
        for (int i = 1; i < arrX.length - 1; i++) {
            if (arrX[i - 1] + arrX[i + 1] < k) {
                sum = sum + arrX[i];
            }
        }
        System.out.println(sum);
    }
}
