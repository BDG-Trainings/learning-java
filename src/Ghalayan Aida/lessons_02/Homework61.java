public class Homework61{
    public static void main(String [] args){
    int number = 1221;
    int miavor = number% 10;
    int tasnavor = (number / 10) %10;
    int haryuravor = (number / 100)%10;
    int hazaravor = number / 1000;
    boolean t;
    if (miavor + tasnavor == haryuravor + hazaravor){
       t = true;
    }else {
        t = false;
    }
        System.out.println(t);
}
}