package ArmenIskandaryan.Lesson_04;

public class App_271 {
    public static void main(String[] args) {
        char[] arrX = {'a', 'b', 'd', 'a', 'r', 'k', 'b', 'a', 'r'};
        int count = 0;
        for (int i = 0; i < arrX.length; i++) {
            if(arrX[i] == 'a') {
                count++;
            }
        }
        System.out.println("'a' արժեքն ունեցող տարրերի քանակն է : " + count);
    }
}
