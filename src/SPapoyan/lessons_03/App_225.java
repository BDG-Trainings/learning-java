package SPapoyan.lessons_03;

public class App_225 {
    public static void main (String [] args) {
        int t = 30;

        int mult = 1;

        int [] numbers = {8, 14, 25, 31, -45, 65};

        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs (numbers [i]) < t ) {
                mult = mult * numbers [i];

            }
        }System.out.println(+mult);
    }
}