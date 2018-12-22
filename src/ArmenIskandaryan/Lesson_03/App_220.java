package ArmenIskandaryan.Lesson_03;

public class App_220 {
    public static void main(String[] args) {
        int [] arr = {5, 0, 2, -10, -20, 30, -25, 50, 10, -5};
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("Դրական տարրերի քանակը հավասար է " + positiveCount);
        System.out.println("Բացասական տարրերի քանակը հավասար է " + negativeCount);
    }
}
