package SPapoyan.lessons_03;

public class App_250 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        double mult = 1;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] * i) % 3 == 2) {
                mult = mult * Math.pow (numbers [i], 2);
            }
        } System.out.println(+mult);
    }
}
