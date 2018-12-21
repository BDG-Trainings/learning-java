package ArmenIskandaryan.Lesson_03;

public class App_231 {
    public static void main(String[] args) {
        int [] arr = {5, 10, 2, -10, 20, 30, -25, 50, 10, -5};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + Math.pow(arr[i], 2);
            }
        }
        System.out.println("Զույգ արժեք ունեցող տարրերի քառակուսիների գումարը հավասար է " + sum);
    }
}
