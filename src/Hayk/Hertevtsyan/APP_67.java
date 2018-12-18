package Hayk.Hertevtsyan;

public class APP_67 {
    public static void main(String[] args) {
        int a = 4132;
        int haz = a/1000;
        int har = (a-haz*1000)/100;
        int tas = (a-haz*1000-har*100)/10;
        int miav = a-haz*1000-har*100-tas*10;
        if (a == (haz+har+tas+miav)*(haz+har+tas+miav)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
