package arsenkarapetyan.lesson_2;

public class App_21 {
    public static void main(String[] args) {

        int a = 20;
        int b = 36;
        int c = -2;
        int max = a;

        if (b > max){
            max=b;
        }
        if (c > max){
            max=c;
        }

        System.out.println("max value is " + max);
    }
}