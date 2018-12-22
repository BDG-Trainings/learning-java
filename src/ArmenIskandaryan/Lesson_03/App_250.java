package ArmenIskandaryan.Lesson_03;

public class App_250 {
    public static void main(String[] args) {
        int [] arr = {15, 10, 7, 7, 2, 5, 20, 30, -25, 50, 40, -5};
        int count = 0;
        double num = 1;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i] * i) % 3 == 2) {
                num = num * Math.pow(arr[i], 2);
            }
        }
            System.out.println("Պահանջվող թիվը հավասար է " + num);
    }
}
