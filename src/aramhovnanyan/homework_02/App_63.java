package arsenkarapetyan.lesson_02;

public class App_63 {
    public static void main(String[] args) {
        boolean t = false;
        int a = 1583;


        int haz = (a / 1000);
        int har = ((a % 1000) / 100);
        int tas = ((a % 100) / 10);
        int mia = (a % 10);

        if (haz == 1 && har == 1 && tas == 1 && mia == 1) {
            System.out.println(1);


        }else {
            System.out.println(0);
        }
    }
}
