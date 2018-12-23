package SPapoyan.lessons_03;

public class App_217 {
    public static void main(String[] args) {
        int number = 5;
        int[] numbers = new int[number];
        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 20;
        numbers[3] = 25;
        numbers[4] = 30;
        int mult = 1;
        for (int i = 0; i < number; i++) {
            if (numbers[i] % 2 != 0) {
                mult = mult * numbers [i];
            }
        }
        System.out.println(+ mult * mult );
    }
}

