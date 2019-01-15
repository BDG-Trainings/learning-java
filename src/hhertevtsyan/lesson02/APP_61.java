package hhertevtsyan.lesson02;

public class APP_61 {
    public static void main(String[] args) {
        int a = 8659;
        boolean t;
        int haz = a/1000;
        int har = (a-haz*1000)/100;
        int tas = (a-haz*1000-har*100)/10;
        int miav = a-haz*1000-har*100-tas*10;
        if (miav+tas == haz+har) {
            t=true;
            System.out.println(t);
        } else {
            t=false;
            System.out.println(t);
        }
    }
}
