package SPapoyan.lessons_03;

public class App_244 {
    public static void main (String[]args) {
        int[]numbers = {51,12,14,11,22,44};
            int mult = 1;
        for (int i = 0; i<numbers.length; i++) {
            if (numbers [i] % 5 == 2) {
                mult = mult * numbers [i];
            }
        } System.out.println(+mult);
    }
}
