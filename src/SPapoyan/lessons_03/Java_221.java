package SPapoyan.lessons_03;

public class Java_221 {
    public static void main (String [] args) {
        int a = 10;
        int b = 45;
        int sum = 0;
        int [] numbers = {8, 14, 25, 31, 45, 65};
         for (int i = 0; i < numbers.length; i++) {
             if (numbers [i] >= a && numbers [i] <= b) {
                 sum = sum + numbers [i];
             }
        }System.out.println(+sum);
    }
}
