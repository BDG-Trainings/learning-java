package ArmenIskandaryan.Lesson_04;

public class App_342 {
    public static void main(String[] args) {
        int [] arrX = {1, 15, -20, 50, -21, -8, -5, 27, -10, 3, -5};
        int count = 0;
        for (int i = 0; i  < arrX.length; i++) {
            boolean unique = true;
            for (int j = 0; j < arrX.length; j++) {
                if ((j != i) && (arrX[j] == arrX[i])) {
                    unique = false;
                    break;
                }
            }
            if (!unique) {
                count++;
            }
        }
        System.out.println(" -> " + count);
    }
}