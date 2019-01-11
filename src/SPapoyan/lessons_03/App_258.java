package SPapoyan.lessons_03;

public class App_258 {
    public static void main (String[]args) {
        int [] numbers = {91,2,3,40,5,6,7,40,91,10};
        int max = numbers [0];
        int lastmax = 0;
        for (int i = 0; i<numbers.length; i++) {
            if (numbers [i] >= max) {
                max = numbers[i];
                lastmax = i;

            }
        }
        System.out.println(+lastmax);
    }

}
