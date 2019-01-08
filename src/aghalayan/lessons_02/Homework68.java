package aghalayan.lessons_02;

public class Homework68 {
    public static void main(String[] args){
        int number = 5145;
        int miavor = number% 10;
        int tasnavor = (number / 10)% 10;
        int haryuravor = (number / 100)% 10;
        int hazaravor = number / 1000;
        if (miavor > tasnavor ){
            System.out.println(miavor * haryuravor);
        }else{
            System.out.println("1");
        }
    }
}

