package Hayk.Hertevtsyan;

public class APP_64 {
    public static void main(String[] args) {
        int a = 2150;
        int haz = a/1000;
        int har = (a-haz*1000)/100;
        int tas = (a-haz*1000-har*100)/10;
        int miav = a-haz*1000-har*100-tas*10;
        char y;
        if (tas + miav == 5) {
            y = 's';
            System.out.println(y);
        } else {
            y = 'd';
            System.out.println(y);
        }
    }
}
