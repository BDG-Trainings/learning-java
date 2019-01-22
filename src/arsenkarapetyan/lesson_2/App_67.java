package arsenkarapetyan.lesson_2;

public class App_67 {

    public static void main(String[] args) {
        int a = 4124;

        double haz = (a / 1000);
        double har = ((a % 1000) / 100);
        double tas = ((a % 100) / 10);
        double mia = (a % 10);

        if (a == Math.pow(2, haz+har+tas+mia)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        System.out.println(Math.pow(haz+har+tas+mia, 2));
    }
}
