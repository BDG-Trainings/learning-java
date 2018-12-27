package SPapoyan.lessons_03;

public class App_226 {
    public static void main (String [] args) {
        int t = 40;

        int N = 0;

        int [] numbers = {8, 14, 25, -31, 45, 65};

        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs (numbers [i]) < t ) {
                N = N + 1;

            }
        }System.out.println(+N);
    }
}