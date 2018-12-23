package SPapoyan.lessons_03;

public class App_211 {

    public static void main(String[] args) {
        int number = 5;
        int[] numbers = new int[number];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        int sum = 0;
        int count = 0;
        sum = 0;
        for (int i = 0; i < number; i++) {
            if (numbers[i] > 0) {
                sum = sum + numbers[i];
                count = count + 1;
            }
        }
        System.out.println(+ sum / count);
    }
}
