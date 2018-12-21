package ArmenIskandaryan.Lesson_03;

public class App_238 {
    public static void main(String[] args) {
        int [] arr = {15, 10, 2, -10, 20, 30, -25, 50, 10, -5};
        int count = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                count++;
                sum = sum + arr[i];
            }
        }
        if (count > 0) {
            double mt = sum / count;
            System.out.println("3-ին բազմապատիկ թվերի միջին թվաբանականը հավասար է " + mt);

        } else {
            System.out.println("3-ին բազմապատիկ թվերի քանակը հավասար է 0-ի, հետևաբար, դրանց միջին թվաբանականը ևս հավասար է 0");
        }
    }
}
