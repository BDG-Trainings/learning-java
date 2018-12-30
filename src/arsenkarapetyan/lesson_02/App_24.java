package arsenkarapetyan.lesson_02;

public class App_24 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;
        boolean t = false;

        if (a == 2 && b == 2 && c != 2){
            t=true;
        }
        if (b == 2 && c == 2 && a != 2){
            t=true;
        }
        if (c== 2 && a == 2 && b != 2){
            t=true;
        }

        System.out.println(t);
    }
}

