package SPapoyan.lessons_03;

public class App_251 {
    public static void main (String [] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers [i];
            }
        } System.out.print(+max);
    }
}
