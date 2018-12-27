package arsenkarapetyan.lesson_4;

public class App_275 {

    public static void main(String[] args) {

        char[] symbols = {'A', 'v', 's', 'a', 'x', 's', 'N', 'b', 't', 'b', 's', 'm',};
        int count_value = 0;

        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] < 107) {
                count_value++;
            }
        }
        System.out.println("'k' ic poqr arzheq ynecogh tarreri qanake: " + count_value + " e.");
    }
}
