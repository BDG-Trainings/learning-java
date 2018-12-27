package SPapoyan.lessons_03;

public class App_224 {
    public static void main (String [] args) {

        int k = 15;
        int [] numbers = {8, 14, 25, 31, 45, 65};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs (numbers [i]) < k ) {
                sum = sum + Math.pow(numbers [i], 3);
            }
        }System.out.println(+sum);
    }
}
