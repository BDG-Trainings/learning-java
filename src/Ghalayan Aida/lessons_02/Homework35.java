public class Homework35{
    public static void main(String[] args){
        int a = 5;
        int b = 1;
        int c = 2;
        int d = 2;
        if (a + b + d == c | a + c + d == b | b + d + c == a | b + c + a == d ){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}

