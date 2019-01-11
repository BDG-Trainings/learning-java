package SPapoyan.lessons_03;

public class App_257 {
    public static void main(String[] args) {

        int[] numbers = {10, 2, 3, 80, 25, 6, 80, 8, 2, 10};
        int max = numbers[0];
        int firstmax = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                firstmax = i;

            }
        }System.out.println(+firstmax);
    }
}