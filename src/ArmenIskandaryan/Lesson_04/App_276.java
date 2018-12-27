package ArmenIskandaryan.Lesson_04;

public class App_276 {
    public static void main(String[] args) {
        char[] arrX = {'a', 'b', 's', 'a', 'w', 'k', 'b', 'a', 'd'};
        int count = 0;
        boolean t = false;
        for (int i = 0; i < arrX.length; i++) {
            if(arrX[i] == 'r') {
                t = true;
                break;
            }
        }
        System.out.println("Պահանջվող արժեքն է : " + t);
    }
}
