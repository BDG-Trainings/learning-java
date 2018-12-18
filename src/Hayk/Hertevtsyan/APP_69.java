package Hayk.Hertevtsyan;

public class APP_69 {
    public static void main(String[] args) {
        int a = 2150;
        int haz = a/1000;
        int har = (a-haz*1000)/100;
        int tas = (a-haz*1000-har*100)/10;
        int miav = a-haz*1000-har*100-tas*10;
        int y;
        if (haz + har + tas + miav > 20) {
            y = 1;
            System.out.println(y);
        } else {
            y = 0;
            System.out.println(y);
        }
    }
}
