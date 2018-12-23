package SPapoyan.lessons_03;

public class App_216 {
    public static void main(String[] args) {
        int[] number = {10, 15, 10, 25, 10};

        int mult = 1;

        for (int i = 0; i < number.length; i = i + 2) {
            mult = mult * number[i];
        }
        System.out.println(+mult);
    }
}

