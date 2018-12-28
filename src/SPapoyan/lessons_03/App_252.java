package SPapoyan.lessons_03;

public class App_252 {
    public static void main (String [] args) {
        int [] numbers = {2,3,4,5,6,7,8,9,10};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers [i];
            }
        } System.out.print(+min);
    }
}
