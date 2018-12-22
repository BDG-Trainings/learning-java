package ArmenIskandaryan.Lesson_03;

public class App_269 {
    public static void main(String[] args) {
        int [] arrX = {15, 50, 7, 7, 2, 5, 20, 30, -25, 50, 40, -5};
        int [] arrY = {5, 10, -5, 7, 12, 5, 2, 63, -5, 52, 4, 15};
        int sum = 0;

        for (int i = 0; i < arrX.length; i = i + 2) {
            sum = sum + arrX[i];
        }
        for (int i = 1; i < arrY.length; i = i + 2) {
            sum = sum + arrY[i];
        }
        System.out.println("Պահանջվող թիվը հավասար է " + sum);
    }
}
