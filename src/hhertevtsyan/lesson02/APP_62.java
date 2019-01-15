package hhertevtsyan.lesson02;

public class APP_62 {
    public static void main(String[] args) {
        int a = 2659;
        double division;
        int haz = a/1000;
        int har = (a-haz*1000)/100;
        int tas = (a-haz*1000-har*100)/10;
        int miav = a-haz*1000-har*100-tas*10;
        if (a < 5000) {
            division = a/(miav+har);
            System.out.println(division);
        } else {
            division=a/(haz+tas);
            System.out.println(division);
        }
    }
}
