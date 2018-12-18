public class Homework67 {
    public static void main(String[] args){
        int number = 5043;
        int miavor = number% 10;
        int tasnavor = (number / 10)% 10;
        int haryuravor = (number / 100)% 10;
        int hazaravor = number / 1000;
        if ((miavor + tasnavor + haryuravor + hazaravor)* (miavor + tasnavor + haryuravor + hazaravor) == 5043){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
     }
}
