package aghalayan.lessons_02;

public class Homework63{
    public static void main(String[] args){
        int number = 5008;
        int miavor = number% 10;
        int tasnavor = (number / 10)% 10;
        int haryuravor = (number / 100)% 10;
        int hazaravor = number / 1000;
        if (miavor == 1 | tasnavor == 1 | haryuravor == 1 | hazaravor ==1){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

