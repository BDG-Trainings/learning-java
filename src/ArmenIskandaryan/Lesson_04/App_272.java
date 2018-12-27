package ArmenIskandaryan.Lesson_04;

public class App_272 {
    public static void main(String[] args) {
        char[] arrX = {'a', 'b', 'd', 'a', 'r', 'k', 'b', 'a', 'r'};
        int count = 0;
        for (int i = 0; i < arrX.length; i++) {
            if(arrX[i] == 'b') {
                count++;
            }
        }
        boolean t = false;
        if (count >= arrX.length / 2) {
            t = true;
        }
        System.out.println("Պահանջվող արժեքն է : " + t);
    }
}
