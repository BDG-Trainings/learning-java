package aramhovnanyan.homework_04;

public class App_272 {

    public static void main(String[] args) {

        boolean t = false;

        char [] symbols = {'b','v','b','a','x','b','a','b','t','b','b','m',};
        int count_value=0;

        for (int i=0; i<symbols.length; i++){
            if(symbols[i]==98){
                count_value++;
            }
        }
        if (count_value >= symbols.length/2){
            t = true;
        }
        System.out.println(t);
    }
}
