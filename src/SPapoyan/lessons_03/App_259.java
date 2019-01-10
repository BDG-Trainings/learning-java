package SPapoyan.lessons_03;

public class App_259 {
    public static void main(String[] args) {

        int[] numbers = {10, 2, 3, 80, 25, 6, 80, 8, 2, 10};
        int min = numbers[0];
        int firstmin = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                firstmin = i;

            }
        }System.out.println(+firstmin);
    }
}