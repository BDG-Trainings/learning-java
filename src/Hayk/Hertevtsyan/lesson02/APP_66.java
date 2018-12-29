package Hayk.Hertevtsyan.lesson02;

public class APP_66 {
    public static void main(String[] args) {
        int a = 4132;
        int haz = a/1000;
        int har = (a-haz*1000)/100;
        int tas = (a-haz*1000-har*100)/10;
        int miav = a-haz*1000-har*100-tas*10;
        if (haz == 4 || miav == 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
