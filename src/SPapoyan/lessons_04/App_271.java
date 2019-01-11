package SPapoyan.lessons_04;

public class App_271 {
    public static void main(String[]args) {
        int n = 6;
        char name [] = {'a', 'b', 'c', 'a','e','a'};
        int a_count = 0;
        for (int i = 0; i < name.length; i++) {
            if (name [i] == 'a') {
                a_count++;
            }
        } System.out.println(+a_count);
    }
}
