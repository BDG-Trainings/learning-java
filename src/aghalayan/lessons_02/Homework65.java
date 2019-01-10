package aghalayan.lessons_02;

public class Homework65 {
    public static void main(String[] args){
        int number = 5043;
        int miavor = number% 10;
        int tasnavor = (number / 10)% 10;
        int haryuravor = (number / 100)% 10;
        int hazaravor = number / 1000;
        if (miavor * tasnavor == 12){
          System.out.println("y = 12");
        }else{
            System.out.println("y = 0");
        }
}
}
