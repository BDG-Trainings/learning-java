package aghalayan.lessons_02;

public class Homework64 {
    public static void main(String[] args){
        int number = 5014;
        int miavor = number% 10;
        int tasnavor = (number / 10)% 10;
        char y;
        if (miavor + tasnavor == 5){
            y = 's';
        }else {
            y = 'd';
        }
            System.out.println(y);
        }
    }
