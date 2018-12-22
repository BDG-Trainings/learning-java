package ArmenIskandaryan.Lesson_03;

public class App_215 {
    public static void main(String[] args) {
        int [] arr = {5, 10, 2, -10, -20, 30, -25, 50, 10, -5};
        int sum = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
                sum = sum + arr[i];
        }
        System.out.println("Զույգ ինդեքսով տարրերի գումարը հավասար է " + sum);
    }
}
