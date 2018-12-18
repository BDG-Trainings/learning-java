package Hayk.Hertevtsyan;

public class APP_63 {
    public static void main(String[] args) {
        int a = 2159;
        int haz = a/1000;
        int har = (a-haz*1000)/100;
        int tas = (a-haz*1000-har*100)/10;
        int miav = a-haz*1000-har*100-tas*10;
        if (haz ==1 || har == 1 || tas == 1 || miav ==1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
