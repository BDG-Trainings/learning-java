package SPapoyan.lessons_02;

public class App_67 {
    public static void main(String[] args) {

        int number = 4994;
        int miavor = number / 1000;
        int tasnavor = (number / 100) % 10;
        int haryuravor = (number / 10) % 10;
        int hazaravor = (number % 10);

        if (number == (miavor + tasnavor + haryuravor + hazaravor) * (miavor + tasnavor + haryuravor + hazaravor)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}