package aramhovnanyan.homework_04;

public class App_276 {

    public static void main(String[] args) {

        boolean t = false;
        char[] symbols = {'A', 'v', 's', 'a', 'x', 's', 'N', 'v', 'r', 'b', 's', 'm'};

        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == 114) {
                t = true;
            }
        }
        System.out.println(t);
    }
}
