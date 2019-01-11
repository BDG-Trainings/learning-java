package SPapoyan.lessons_04;

public class App_273 {
    public static void main (String []args) {
        int n = 6;
        int index = 0;
        char name [] = {'a', 'b', 'c', 's','e','s'};
         for (int i = 0; i < name.length; i++) {
             if (name [i] == 's') {
                index = index + i;
             }
         } System.out.println(+index);

    }
}
