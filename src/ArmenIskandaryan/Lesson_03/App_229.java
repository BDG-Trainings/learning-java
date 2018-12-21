package ArmenIskandaryan.Lesson_03;

public class App_229 {
    public static void main(String[] args) {
        int [] arr = {5, 10, 2, -10, 20, 30, -25, 50, 10, -5};
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - i > 0) {
                num = num * arr[i];
            }
        }
        System.out.println(num);
    }
}
