package ArmenIskandaryan.Lesson_04;

public class App_336 {
    public static void main(String[] args) {
        int [] arrX = {1, 15, -20, 50, -21, -8, 5, 27, -10, 3, -5};
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] < 0) {
                flag = true;
            }
            if (arrX[i] > arrX[index]) {
                index = i;
            }
        }
        if (flag) {
            System.out.println(index + " -> " + arrX[index]);
        } else {
            System.out.println("s = 0");
        }
    }
}