package ArmenIskandaryan.Lesson_03;

public class App_216 {
    public static void main(String[] args) {
        int [] arr = {5, 10, 2, -10, -20, 30, -25, 50, 10, -5};
        long num = 1;
        for (int i = 0; i < arr.length; i = i + 2) {
                num = num * arr[i];
        }
        System.out.println("Զույգ ինդեքսով տարրերի արտադրյալը հավասար է " + num);
    }
}
