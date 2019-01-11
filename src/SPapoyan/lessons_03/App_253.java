package SPapoyan.lessons_03;

public class App_253 {
    public static void main (String [] args) {
        int [] numbers = {2,3,4,5,6,7,8,9,40};
        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers [i];
            }
        }
        for (int i = 0; i<numbers.length; i++) {
            if (numbers [i] > max) {
                max = numbers [i];
            } sum = min + max;
        } System.out.println(+sum);
    }
}