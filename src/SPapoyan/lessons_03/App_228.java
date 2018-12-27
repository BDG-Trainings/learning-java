package SPapoyan.lessons_03;

public class App_228 {
    public static void main (String [] args) {
        int k = 40;


        int [] numbers = {8, 10, 20, 31, 45, 65, 75};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (k % numbers [i] == 0 ) {
                sum = sum + numbers [i];
                }
        }System.out.println(+sum);
    }
}