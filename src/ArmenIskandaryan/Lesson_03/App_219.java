package ArmenIskandaryan.Lesson_03;

public class App_219 {
    public static void main(String[] args) {
        int [] arr = {5, 10, 2, -10, -20, 30, -25, 50, 10, -5};
        int k = 5;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        System.out.println("Տրված k թվին բազմապատիկ ինդեքսով տարրերի քանակը հավասար է " + count);
    }
}
