package arsenkarapetyan.lesson_2;

public class App_64 {
    public static void main(String[] args) {
        int a = 4124;

        int haz = (a / 1000);
        int mia = (a % 10);
        if (haz == 4 && mia == 4){

            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }

    }
}
