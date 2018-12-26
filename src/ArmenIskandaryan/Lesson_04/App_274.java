package ArmenIskandaryan.Lesson_04;

public class App_274 {
    public static void main(String[] args) {
        char[] arrX = {'a', 'b', 's', 'a', 'r', 'k', 'b', 'a', 'r'};
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arrX.length; i++) {
            if(arrX[i] > 'h') {
                count++;
                sum = sum + i;
            }
        }
        if (count > 0) {
            System.out.println("Պահանջվող արժեքն է " + sum / count);
        } else {
            System.out.println("Քանի որ փնտրվող թվերի քանակը հավասար է 0-ի, հետևաբար, պահանջվող արժեքը ևս հավասար է 0");
        }
    }
}
