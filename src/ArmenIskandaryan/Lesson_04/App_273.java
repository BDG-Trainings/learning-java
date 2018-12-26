package ArmenIskandaryan.Lesson_04;

public class App_273 {
    public static void main(String[] args) {
        char[] arrX = {'a', 'b', 's', 'a', 'r', 'k', 'b', 'a', 'r'};
        int count = 0;
        for (int i = 0; i < arrX.length; i++) {
            if(arrX[i] == 's') {
                count = count + i;
            }
        }
        System.out.println("Պահանջվող արժեքն է : " + count);
    }
}
