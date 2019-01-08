package aghalayan.lessons_02;
public class Homework24{
    public static void main(String[] args){
        int a = 5;
        int b = 2;
        int c = 2;
        if (a == 2 && b == 2){
            System.out.println(true);
        }else if(a == 2 && c == 2) {
            System.out.println(true);
        }else if (b == 2 && c == 2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

