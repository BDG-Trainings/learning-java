package Hayk.Hertevtsyan.lesson02;

public class APP_70 {
    public static void main(String[] args) {
        int a = 9859;
        int haz = a/1000;
        int har = (a-haz*1000)/100;
        int tas = (a-haz*1000-har*100)/10;
        int miav = a-haz*1000-har*100-tas*10;
        int y;
        if (haz * har * tas * miav > 200) {
            y = 1;
            System.out.println(y);
        } else {
            y = 0;
            System.out.println(y);
        }
    }
}
