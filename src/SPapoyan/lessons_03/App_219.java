package SPapoyan.lessons_03;

public class App_219 {
    public static void main(String[] args) {

        int number = 5;
        int [] numbers = new int [number];
        int k = 2;
        numbers [0] = 4;
        numbers [1] = 9;
        numbers [2] = 36;
        numbers [3] = 18;
        numbers [4] = 45;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % k == 0) {
                count++;
            }
        }System.out.println( +count);
    }
}
