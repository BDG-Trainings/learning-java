package arsenkarapetyan.lesson_4;

public class App_273 {

    public static void main(String[] args) {

        char[] symbols = {'b', 'v', 's', 'a', 'x', 's', 'a', 'b', 't', 'b', 's', 'm',};
        int count_value = 0;
        int sum = 0;

        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == 115) {
                count_value++;
                sum=sum+i;
            }
        }
        System.out.println("'s' tarreri qanake: " + count_value + " hat e isk indexneri gymare: " + sum);
    }
}
