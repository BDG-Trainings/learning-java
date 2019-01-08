package aghalayan.lessons_02;

public class Homework70 {
    public static void main(String[] args){
        int number = 1234;
        int miavor = number% 10;
        int tasnavor = (number / 10)% 10;
        int haryuravor = (number / 100)% 10;
        int hazaravor = number / 1000;
        int y;
        if ((miavor * tasnavor * haryuravor *hazaravor) > 200) {
            y = 0;
        }else{
            y = 1;
        }
        System.out.print(y);
    }
}

