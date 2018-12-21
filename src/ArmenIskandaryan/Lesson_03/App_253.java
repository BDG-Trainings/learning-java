package ArmenIskandaryan.Lesson_03;

public class App_253 {
    public static void main(String[] args) {
        int [] arr = {15, 10, 7, 7, 2, 5, 20, 30, -25, 50, 40, -5};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int num = min + max;
        System.out.println("Պահանջվող թիվը հավասար է " + num);
    }
}
