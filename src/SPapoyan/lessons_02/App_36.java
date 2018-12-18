package SPapoyan.lessons_02;

public class App_36 {
    public static void main (String [] args) {

        int a = 5;
        int b = 8;
        int c = 6;
        int d = 9;

        if (a%2 != 0 && b%2 != 0 || a%2 != 0 && c%2 != 0 || a%2 != 0 && d%2 != 0 ||
                b%2 != 0 && c%2 != 0 ||  b%2 != 0 && d%2 != 0 ||
                   c%2 != 0 && d%2 != 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
         }
     }
}
