package aramhovnanyan.homework_04;

public class App_274 {

    public static void main(String[] args) {

        char[] symbols = {'b', 'v', 's', 'a', 'x', 's', 'a', 'b', 't', 'b', 's', 'm',};
        int count_value = 0;
        int sum = 0;

        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] > 104) {
                count_value++;
                sum=sum+i;
            }
        }
        System.out.println("'h' ic mec tarreri qanake: " + count_value + " isk nrac gymare: " + sum);
        System.out.println("'h' ic mec tarreri indexneri mijin tvabanakane havasar e: " + sum/count_value);
    }
}
