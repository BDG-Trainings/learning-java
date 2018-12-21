package ArmenIskandaryan.Lesson_03;

public class App_258 {
    public static void main(String[] args) {
        int [] arr = {15, 50, 7, 7, 2, 5, 20, 30, -25, 50, 40, -5};
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Պահանջվող թիվը հավասար է " + maxIndex);
    }
}
