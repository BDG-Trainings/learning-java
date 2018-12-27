package SPapoyan.lessons_03;

public class App_220 {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, 4, 5, -15, -25, 4, - 11};
        int plus = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                plus = plus + 1;
            }
        } System.out.println(+plus);
            int minus = 0;
        for (int i = 0; i < numbers.length; i++ ) {
            if (numbers[i] < 0) {
                minus = minus + 1;
            }
        } System.out.println(+minus);
    }
}