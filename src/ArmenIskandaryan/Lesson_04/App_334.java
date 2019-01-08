package ArmenIskandaryan.Lesson_04;

public class App_334 {
    public static void main(String[] args) {
        int [] arrX = {1, 15, -20, 50, -21, -8, 5, 27, -10, 3, -5};
        int k = 0;
        int num;
        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] > arrX[k]) {
                k = i;
            }
        }
        if (k <= (arrX.length / 2)) {
            num = 0;
            for (int i = 0; i < arrX.length; i++) {
                if (arrX[i] > 0) {
                    num = num + arrX[i];
                }
            }
        } else {
            num = 1;
            for (int i = 0; i < arrX.length; i++) {
                if (arrX[i] < 0) {
                    num = num * arrX[i];
                }
            }

        }
        System.out.println(num);
    }
}
