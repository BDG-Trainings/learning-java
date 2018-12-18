public class Homework62 {
    public static void main(String[] args) {
        int number = 5001;
        int miavor = number% 10;
        int tasnavor = (number / 10)% 10;
        int haryuravor = (number / 100)% 10;
        int hazaravor = number / 1000;
        if (number < 5000){
            System.out.println(number/ (miavor + haryuravor));
        } else {
            System.out.println(number/ (tasnavor + hazaravor));
        }
    }
}