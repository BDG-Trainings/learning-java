package Hayk.Hertevtsyan;

public class APP_68 {
    public static void main(String[] args) {
        int a = 4135;
        int haz = a/1000;
        int har = (a-haz*1000)/100;
        int tas = (a-haz*1000-har*100)/10;
        int miav = a-haz*1000-har*100-tas*10;
        if (miav > tas) {
            System.out.println(miav*har);
        } else {
            System.out.println(1);
        }
    }
}
