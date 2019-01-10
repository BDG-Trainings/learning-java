package aghalayan.lessons_02;

public class Homework21 {
    public static void main(String [] args){
        int a = 10;
        int b = 15;
        int c = 20;
        if (a > b && b > c) {
            System.out.println(a);
        }else if (b > c && c > a){
            System.out.println(b);
        }else if (c > a && a > b){
            System.out.println(c);
        }else if (c > b && b > a){
            System.out.println(c);
        }else if (a > c && c > b){
            System.out.println(a);
        }else if (b > a && a > c){
            System.out.println(b);
        }
    }
}

