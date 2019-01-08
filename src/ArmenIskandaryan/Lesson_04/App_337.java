package ArmenIskandaryan.Lesson_04;

public class App_337 {
    public static void main(String[] args) {
        int [] arrX = {1, 15, -20, 50, -21, -8, 5, 27, -10, 3, -5};
        int sum = 0;
        int art = 1;
        for (int i = 0; i < arrX.length; i++) {
            if (i % 2 == 0) {
                art = art * arrX[i];
            } else {
                sum = sum + arrX[i];
            }
        }
        if (art > 0) {
            System.out.println(" -> " + sum);
        } else {
            System.out.println("s = 1");
        }
    }
}