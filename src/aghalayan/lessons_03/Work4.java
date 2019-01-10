package aghalayan.lessons_03;

public class Work4{
    public static void main(String  args[]){
        int a = 20;
        int b = 10;
        int c =15;
        if (a < b && b < c){
            System.out.println(c);
        }else if (b < a && a < c) {
            System.out.println(c);
        } else if (c < b && b < a){
            System.out.println(a);
        }else if (b < c && c < a){
            System.out.println(a);
        }else if (c< a && a < b){
            System.out.println(b);
        }else if (a < c && c < b){
            System.out.println(b);
        }
    }
}