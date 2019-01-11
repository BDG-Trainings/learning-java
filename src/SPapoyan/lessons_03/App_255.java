package SPapoyan.lessons_03;

public class App_255 {
    public static void main (String [] args) {
        int [] numbers = {1,2,3,400,500,6000,7,8,9,10};
        int max = numbers[0];
        int N = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers [i];
                N++;
            }
        } System.out.print(+max+N);
    }
}
