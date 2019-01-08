package aghalayan.lessons_02;
public class Homework36{
    public static void main(String[] args){
        int a = 5;
        int b = 4;
        int c = 2;
        int d = 3;
        if (a % 2 ==1 && b % 2 == 1){
            System.out.println(1);
        }else if (a % 2 ==1 && c % 2 == 1){
            System.out.println(1);
        }else if (a % 2 ==1 && d % 2 == 1){
            System.out.println(1);
        }else if (b % 2 ==1 && c % 2 == 1){
            System.out.println(1);
        }else if (b % 2 ==1 && d % 2 == 1){
            System.out.println(1);
        }else if (d % 2 ==1 && c % 2 == 1){
            System.out.println(1);
        }else {
            System.out.println(2);
        }
    }
}
