package ArmenIskandaryan.Lesson_03;

public class App_246 {
    public static void main(String[] args) {
        int [] arr = {15, 10, 2, -10, 5, 20, 30, -25, 50, 40, -5};
        int count = 0;
        int sum = 0;
        for (int i = 0; Math.pow(i, 2) < arr.length; i++) {
            count++;
            sum = sum + arr[(int)Math.pow(i, 2)];
        }
        if (count > 0) {
            double mt = sum / count;
            System.out.println("Պահանջվող թվերի միջին թվաբանականը հավասար է " + mt);

        } else {
            System.out.println("Քանի որ պահանջվող թվերի քանակը հավասար է 0-ի, հետևաբար, դրանց արտադրյալը ևս հավասար է 0");
        }
    }
}
