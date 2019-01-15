package hhertevtsyan.lesson02;

public class APP_65 {
    public static void main(String[] args) {
        int a = 2134;
        int haz = a/1000;
        int har = (a-haz*1000)/100;
        int tas = (a-haz*1000-har*100)/10;
        int miav = a-haz*1000-har*100-tas*10;
        if (tas*miav ==12) {
            System.out.println("y=12");
        } else {
            System.out.println("y=0");
        }
    }
}
