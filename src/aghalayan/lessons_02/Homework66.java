package aghalayan.lessons_02;

public class Homework66 {
    public static void main(String[] args){
        int number = 4008;
        int miavor = number% 10;
        int tasnavor = (number / 10)% 10;
        int haryuravor = (number / 100)% 10;
        int hazaravor = number / 1000;
        if (miavor == 4 | hazaravor ==4){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}