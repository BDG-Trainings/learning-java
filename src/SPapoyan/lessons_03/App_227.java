package SPapoyan.lessons_03;

public class App_227 {
    public static void main (String [] args) {
        int k = 40;


        int [] numbers = {8, 10, 20, 31, 45, 65, 75};
        double sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (k % numbers [i] == 0 ) {
            sum = sum + numbers [i];
            count = i+1;}
            }System.out.println(+sum/count);
        }
    }

