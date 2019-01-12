package arsenkarapetyan.lesson_2;

public class App_61 {

    public static void main(String[] args) {

        boolean t = false;
        int a = -9568;
        char b = ' ';

        int haz = Math.abs(a/1000);
        int har = Math.abs((a%1000)/100);
        int tas = Math.abs((a%100)/10);
        int mia = Math.abs(a%10);

        if ((haz + har) == (tas + mia)){
            t = true;
        }
        System.out.println(t);
        if (a < 0){
            b = '-';
        }
        System.out.println("Tive: " + b + haz + har + tas + mia);
    }
}
