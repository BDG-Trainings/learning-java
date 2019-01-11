    package SPapoyan.lessons_04;

    public class App_275 {
        public static void main (String []args) {
            int n = 7;
            char name [] = {'a', 'n', 'm', 'l','e','a', 'k'};
            int sum = 0;
            for (int i = 0; i < name.length; i++) {
                if (name [i] < 'k') {
                    sum++;
                }
            } System.out.println(+sum);
        }
    }
