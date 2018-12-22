package ArmenIskandaryan.Lesson_03;

public class App_244 {
    public static void main(String[] args) {
        int [] arr = {15, 10, 2, -10, 20, 30, -25, 50, 10, -5};
        int count = 0;
        double num = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 2) {
                count++;
                num = num * arr[i];
            }
        }
        if (count > 0) {
            System.out.println("Պահանջվող թվերի արտադրյալը հավասար է " + num);

        } else {
            System.out.println("Քանի որ պահանջվող թվերի քանակը հավասար է 0-ի, հետևաբար, դրանց արտադրյալը ևս հավասար է 0");
        }
    }
}
